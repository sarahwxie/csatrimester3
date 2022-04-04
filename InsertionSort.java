// Week 3, Merge Sort

// import packages
package src;
import java.util.*;
import java.lang.Math;


// Java program for implementation of Insertion Sort
class InsertionSort {
	/*Function to sort array using insertion sort*/
  private static int comparisons;
  private static int swaps;  
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
      comparisons++;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j] > key) {
        swaps++;
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[])
	{
    System.out.println("\nINSERTION SORT: ");
    long startTime = System.nanoTime();
    int[] arr = new int[5000];
    for (int i = 0; i < 5000; i++) { // TODO: CHANGE TO 5000
      Random rand = new Random(); //instance of random class
      int randNum = rand.nextInt(100);
      arr[i] = randNum;  
    }

    //  sort the array
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
    
		System.out.println("Low = " + arr[0]);
    System.out.println("High = " + arr[arr.length-1]);

    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println("Insertion Sort Duration: " + duration + " nanoseconds");

    System.out.println("Swaps = " + swaps);
    System.out.println("Comparisons = " + comparisons);
    
		
	}
} 

