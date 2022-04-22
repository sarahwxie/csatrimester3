# week 0
* a data structure is a method of organizing data
* there are multiple different ways for this data to be organized:
![data structures](https://raw.githubusercontent.com/nighthawkcoders/nighthawk_csp/master/static/assets/DataStrucs.jpg)

**Programing Paradigms**: a strategy to be followed from writing software applications
* imperative paradigm: statements that change a programs state >> describes how a program code works
     * Procedural programming: a type of imperative programming in which the program is built from one or more procedures (subroutines/function) >> known in Python
     * structured programming/modular programming: techniques to improve maintainability
* Object Oriented Paradigm: Relies on objects, re-usable blueprints (classes)
     * OOP is: defining classes with a constructor and instance variables, protecting information through encapsulation (setters, getters), extending classes to maximize code reuse, creating subclass-specific behavior through polymorphism

Data Structures
* Arrays/Lists, Dictionaries/Hash Maps >> accompanied by algorithms

# week 1
* Linked Lists
     * Data structures conversations begin with arrays, which are built in. 
     * Next, there are Linked Lists, which form Stacks and Queues.
* Challenge 1
    * Terminology:
         * In queue, push, add : the head remains constant, add to the tail 
         * de-queue, pop, remove : the tail remains constant, remove from the head 
         * there is a head (start) and a tail (points to null) to a queue
* Challenge 2
    * I'll need to merge/combine the 2 Queues that are ordered
    * Helps if you "peek" at the data at the head of the queue
* Challenge 3
    * Build a stack and use it to reverse the order of a queue
    * You'll need to build and print your queue
    * Will need to de-queue the elements as you unorder them
* Notes on the given code:
    * the T is the "generic T" which means that it can be any piece of data 
    * this is used within the class
    * implements Iterable<T> allows foreach to work with our data structure
    * a queue HAS A linked list, not IS A linked list >> because a queue is a data structure
    * a linked list has data ( could be strings, ints, etc. )

# week 2
Calculator using Stacks, ArrayLists:
* Calculator Theory:
     * Reverse Polish Notation is standard calculator method >> allows the computer to understand and read an expression
           * will always work if rules are followed
     * creates a function tokensToReversePolishNotation

```
// Takes tokens and converts to Reverse Polish Notation (RPN), this is one where the operator follows its operands.
    private void tokensToReversePolishNotation () {
        // contains final list of tokens in RPN
        this.reverse_polish = new ArrayList<>();
```

* Other key calculator parts:
    * given driver, defined data structures, defined symbols
    * Test functions
    * Create a calculator class
    * Tokenizer changes string expression into tokens
           * Tokenizer uses for loop to break up the string
           * Can also be multi-character terms (like numbers like 100)
    * write the final methods for calculation, capture attributes, establish a toString
* You have to write rpnToResult() to ensure the Reverse Polish Notation works
* Add the power of operator (ensure that your numbers are in the correct order)
* extra credit:
     * Variable assignment: parse the stack and replace it with the number
     * Can build functions like SQRT() >> shunting yard algorithm

# week 3
* Build custom Bubble Sort, Selection Sort, Insertion Sort and Merge Sort.
* Build a GitHub page that describes Sort implementations and the Big O complexity of these Sorts.
* Establish analytics including: time, comparisons and swaps.
* Average the results for each each Sort, run each at least 12 times and 5000 elements. You should throw out High and Low when doing analysis.
* Make your final/judgement on best sort considering Data Structure loading, Comparisons, Swaps, Big O complexity, and Time.
    
# week 4
* This week focused on crossover grading, so we didn't watch any tech talks
* Instead, since I had to crossover grade with Natasha, I watched a video on making code neater:
    
 [![IMAGE ALT TEXT](http://img.youtube.com/vi/HcijbAI4eB0/0.jpg)](http://www.youtube.com/watch?v=HcijbAI4eB0 "How to make code neater")
    
# week 5
**Unit 1: Primitive Data Types**
* Primitive types are like variable types, and need to be defined in java
* Multiple kinds of numbers: integer (int), floating point (double)
* There are also bytes, shorts, ints, longs. and then floats and doubles
* Chars (2 bytes) and booleans (1 byte)
    
Reflection: While I already knew what the primitive types were, it was nice to be able to be formally intruduced to them. I learned that the numbers can all be divided into integers and floating point numbers. I also learned how much space each one takes up, which we were blind to in Python. It got me thinking about how its really weird how different programming languages all have different operations, and some of them don't require us to define the variable type. For example, Python obviously has to do it at some point in the computer, but allows us (the user) to not have to. I wonder if that makes Python (as a language) slower than the others. 
    
**Unit 2: What is Object Oriented Programming?**
* Assembler input (readable) >> assembler output (hex)
* Object oriented puts the answer first, and then fills in the solutions later
* The example given has a cell phone and all its operations
* The second example given is the class SomeProgram and shows the main setup, which is:
    
```
   public class SomeProgram {
        public static void main (String args[]){
            // code here
        }
    } 
```

Reflection: I learned more about object oriented programming, which I am weak in. Going back to the basics helped me more fully understand object oriented programming, and how it was developed. I also did not know about the step with the assembly code, and how it is converted to hex. 
    
# week 6
# week 7
# week 8
# week 9
# week 10
# week 11
# week 12
