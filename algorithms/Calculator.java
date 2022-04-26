// Week 2, Calculators

// import packages
package src;
import java.util.*;
import java.lang.Math;


// the Calculator class
class Calculator {
  // MR. M's CODE Key instance variables
    private final String expression;
    private ArrayList<String> tokens;
    private ArrayList<String> reverse_polish;
    private Double result;

  // MR. M's CODE: Create a 1 argument constructor
  public Calculator(String expression) {
    // original input
    this.expression = expression;

    // parse expression into terms
    this.termTokenizer();

    // place terms into reverse polish notation
    this.tokensToReversePolishNotation();

    // calculate reverse polish notation
    this.rpnToResult();
  }

  // MR M's CODE: Print the expression, terms, and result
  public String toString() {
    return ("Original expression: " + this.expression + "\n" +
            "Tokenized expression: " + this.tokens.toString() + "\n" +
            "Reverse Polish Notation: " +this.reverse_polish.toString() + "\n" +
            "Final result: " + String.format("%.2f", this.result));
  }
  // MR. M's CODE: TOKENIZER
  // Takes tokens and converts to Reverse Polish Notation (RPN)
  private void tokensToReversePolishNotation () {
    // contains final list of tokens in RPN
    this.reverse_polish = new ArrayList<>();

    // stack is used to reorder for appropriate grouping and precedence
    Stack tokenStack = new Stack();
    for (String token : tokens) {
      switch (token) {
        // If left bracket push token on to stack
        case "(":
          tokenStack.push(token);
          break;
        case ")":
          while (tokenStack.peek() != null && !tokenStack.peek().equals("("))
          {
            reverse_polish.add( (String)tokenStack.pop() );
          }
          tokenStack.pop();
          break;
        case "+":
        case "-":
        case "*":
        case "/":
        case "%":
        case "^":
          
        // While stack
        // not empty AND stack top element
        // and is an operator
        // System.out.println("Is the stack empty" + tokenStack.empty());
        while (tokenStack.empty() == false && isOperator((String) tokenStack.peek()))
        {
          if ( isPrecedent(token, (String) tokenStack.peek() )) {
            reverse_polish.add((String)tokenStack.pop());
            continue;
          }
            break;
        }
        // Push the new operator on the stack
        tokenStack.push(token);
        break;
          default:    // Default should be a number, there could be test here
          this.reverse_polish.add(token);
      }
    }
    // Empty remaining tokens
    while (tokenStack.empty() == false) {
      reverse_polish.add((String)tokenStack.pop());
    }
  }

  // MR. M's CODE: Helper definition for supported operators
  private final Map<String, Integer> OPERATORS = new HashMap<>();
  {
    // Map<"token", precedence>
    OPERATORS.put("^", 2);
    OPERATORS.put("*", 3);
    OPERATORS.put("/", 3);
    OPERATORS.put("%", 3);
    OPERATORS.put("+", 4);
    OPERATORS.put("-", 4);
  }

  // MR. M's CODE: Helper definition for supported operators
  private final Map<String, Integer> SEPARATORS = new HashMap<>();
  {
    // Map<"separator", not_used>
    SEPARATORS.put(" ", 0);
    SEPARATORS.put("(", 0);
    SEPARATORS.put(")", 0);
  }

  // MR. M's CODE: Test if token is an operator
  private boolean isOperator(String token) {
    // find the token in the hash map
    return OPERATORS.containsKey(token);
  }

  // MR. M's CODE: Test if token is an separator
  private boolean isSeperator(String token) {
    // find the token in the hash map
    return SEPARATORS.containsKey(token);
  }

  // MR. M's CODE: Compare precedence of operators.
  private Boolean isPrecedent(String token1, String token2) {
    // token 1 is precedent if it is greater than token 2
    return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
  }

  // SARAH'S CODE: needle in haystack
  private int strStr(String s, String t) {
    if (t.isEmpty()) return 0; // edge case: "",""=>0  "a",""=>0
    for (int i = 0; i <= s.length() - t.length(); i++) {
      for (int j = 0; j < t.length() && s.charAt(i + j) == t.charAt(j); j++)
        if (j == t.length() - 1) return i;
    }
    return -1;
  }

  // SARAH'S CODE: isNumeric function
  public static boolean isNumeric(String str) {
    //match a number with optional '-' and decimal.
    return str.matches("-?\\d+(\\.\\d+)?");  
  }
  // MR. M's CODE: Term Tokenizer takes original expression >> ArrayList of tokens
  private void termTokenizer() {
    // contains final list of tokens
    this.tokens = new ArrayList<>();

    // replace square root with ^ (1/2)
    String lookString = this.expression; // change the string we're looking at
    Integer found = strStr(lookString, "SQRT");
    if (found > 0) {
      // find the number that's being square rooted
      Integer numstart = found + 5;
      String number = "";
      for (int i = numstart; i < lookString.length(); i++){
        Character c = lookString.charAt(i);
        String s = String.valueOf(c); 
        if (c == ')'){ 
          break; 
        }
        if (isNumeric(s)){
          number = number.concat(s);
        }
      }

      // the actual replacement
      String oldSquare = "SQRT(" + number + ")";
      String newSquare = number + " ^ 0.5 ";
      String newString = lookString.replace(oldSquare, newSquare);
      lookString = newString;
    }


    int start = 0;  // term split starting index
    StringBuilder multiCharTerm = new StringBuilder();    // term holder
    for (int i = 0; i < lookString.length(); i++) {
      Character c = lookString.charAt(i);
      if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
        // 1st check for working term and add if it exists
        if (multiCharTerm.length() > 0) {
          tokens.add(lookString.substring(start, i));
        }
        // Add operator or parenthesis term to list
        if (c != ' ') {
          tokens.add(c.toString());
        }
        // Get ready for next term
        start = i + 1;
        multiCharTerm = new StringBuilder();
      }
      else {
        // multi character terms: numbers, functions, perhaps non-supported elements
        // Add next character to working term
        multiCharTerm.append(c);
      }

    }
    // Add last term
    if (multiCharTerm.length() > 0) {
      tokens.add(lookString.substring(start));
    }
  }

  // SARAH'S CODE: Takes RPN and produces a final result
  private void rpnToResult()
  {
    // Stack used to hold calculation while process RPN
    Stack calculation = new Stack();

    // for loop to process RPN
    for (String token : this.reverse_polish)
    {
      // If the token is a number
      if (!isOperator(token))
      {
        // Push number to stack
        double number = Double.parseDouble(token);
        calculation.push(number);
      }
      else
      {
        // Pop the two top entries
        double entry1 = (Double)calculation.pop();
        double entry2 = (Double)calculation.pop();

        // Based off of Token operator calculate result
        double result;
        if (token.charAt(0) == '*') result = entry1 * entry2;
        else if (token.charAt(0) == '/') result = entry1 * entry2;
        else if (token.charAt(0) == '%') result = entry1 % entry2;
        else if (token.charAt(0) == '+') result = entry1 + entry2;
        else if (token.charAt(0) == '-') result = entry1 - entry2;
        else if (token.charAt(0) == '^'){
          result = Math.pow(entry2, entry1); 
          // System.out.println("here is the result " + result);
        }
        else { result = 0.00; }

        // Push result back onto the stack
        calculation.push(result);
      }
    }
    // Pop final result and set as final result for expression
    this.result = (Double)calculation.pop();
  }

  // MR. M's CODE: DRIVER
  // used for running/testing the code
  public static void main(String[] args) {
    Calculator simpleMath = new Calculator("100 + 200  * 3");
    System.out.println("Simple Math\n" + simpleMath);
    System.out.println("\n");

    Calculator parenthesisMath = new Calculator("(100 + 200)  * 3");
    System.out.println("Parenthesis Math\n" + parenthesisMath);
    System.out.println("\n");
    
    Calculator allMath = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
    System.out.println("All Math\n" + allMath);
    System.out.println("\n");
    
    Calculator allMath2 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100");
    System.out.println("All Math2\n" + allMath2);
    System.out.println("\n");

    Calculator power = new Calculator("100 + 2 ^ 4");
    System.out.println("Power\n" + power);
    System.out.println("\n");

    Calculator squareRoot = new Calculator("100 + SQRT(16)");
    System.out.println("Power\n" + squareRoot);
    System.out.println("\n");
    
    System.out.println("\nEnter A New Expression:");
      Scanner scan = new Scanner(System.in);

      String express = scan.nextLine();      
      Calculator expression = new Calculator(express);
      System.out.println("\nChoose the Math:\n" +   expression);
    
  }
}
