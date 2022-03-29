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
# week 4
# week 5
# week 6
# week 7
# week 8
# week 9
# week 10
# week 11
# week 12
