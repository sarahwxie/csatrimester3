// Week 1, Challange 2: Merge sort two sorted queues

// import packages
package src;
import java.util.LinkedList;
import java.util.Queue;

// the orderedQueues class
public class OrderedQueues {

	public static void main(String[] args)
	{
		Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    Queue<Integer> merged = new LinkedList<>();

    /*
    private Queue<Integer> mergedQueue;

    // constructor for the merged linked list
    public QueueMerge() {
      this.mergedQueue = new LinkedList<>(); // assign private variable
    }

    private Queue<Integer> queue1;

    // constructor for queue 1
    public QueueMerge() {
      this.queue1 = new LinkedList<>(); // assign private variable
    }

    private Queue<Integer> queue2;

    // constructor for queue 2
    public QueueMerge() {
      this.queue2 = new LinkedList<>(); // assign private variable
    } */

		// define the array with an array literal
    int[] array1 = new int[]{ 1, 4, 5, 8 }; 
    int[] array2 = new int[]{ 2, 3, 6, 7 }; 

    // create the two queues
    for (int addInt : array1){
      queue1.add(addInt);
    }
    for (int addInt : array2){
      queue2.add(addInt);
    }

    System.out.println("Here are the starting queues:");
    System.out.println(queue1);
    System.out.println(queue2);

		// merge into a singular queue
    for (int i = 0; i < 4; i++){
      int num1 = queue1.remove();
      int num2 = queue2.remove();
      if (num1 > num2){
        merged.add(num2);
        merged.add(num1);
      }
      else {
        merged.add(num1);
        merged.add(num2);
      }
    }

    // print out the merged queue
    System.out.println("\nHere is the merged queue:");
    System.out.println(merged + "\n");
	}
}
