package src;
// package com.nighthawk.csa.starters.squirrel;
import java.util.Random;
import java.util.ArrayList;

// Write a Class Number
public class Number {
    // instance variables

    // Number has a zero Argument constructor
    // Keep a static variable >> and then increment >> can keep a zero argument constructor
    int num;
    int index;
  
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number(int passNum) {
        // constructor
      this.num = (int)Math.floor(Math.random()*37);
      this.index = passNum;
    }

    // It contains a getter for the Random Number
    public int getNumber(){
      return this.num;
    }

    // It contains a getter for Index, or the order it was initialized
    public int index() {
        return this.index;
    }
  
    // Write a tester method
    public static void main(String[] args) {
    // Create an ArrayList of Type Number, my ArrayList is called squirrels
      ArrayList<Number> squirrels = new ArrayList<Number>();
      // Initialize 10 squirrels of class type Number
      for (int j = 0; j < 10; j++)
      {
        Number newnumber = new Number(j+1);
        squirrels.add(newnumber);
      }
      // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops

      ArrayList<Number> sorted = new ArrayList<Number>();
      int n = 10;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (squirrels.get(j).getNumber() > squirrels.get(j+1).getNumber())
                {
                    // swap arr[j+1] and arr[j]
                    Number temp = squirrels.get(j);
                    squirrels.set(j, squirrels.get(j+1));
                    squirrels.set(j+1, temp);
                }
              }
          }
      
      
      /*
      int smallest = 0;
      for (Number num : squirrels)
      {
        if (num.getNumber() > smallest){
          smallest = num.getNumber();
          sorted.add(num);
        }
        else {
          sorted.add(0, num);
        }
      }*/
      
        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
      for (Number sort : squirrels)
      {
        System.out.println("There were " + sort.getNumber() + " squirrels on day " + sort.index());
      }
  }

}


