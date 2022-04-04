# Sorts Reflection and Analysis

## Establish analytics including: time, comparisons and swaps.
These analytics are determined using nanoseconds, if statements, and parts where the array swaps places.

Time: 
* this is done with System.nanotime()

```
long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println("Selection Sort Duration: " + duration + " nanoseconds");
```

Comparisons and swaps:
* this is done with variables in the class

```
private static int comparisons;
  private static int swaps;
```


## Average the results for each each Sort, run each at least 12 times and 5000 elements.  You should throw out High and Low when doing analysis.
Here's an average sample of time, comparisons, and swaps -- this is after being run 12 times and finding the average

```
MERGE SORT: 
Low = 0
High = 99
Merge Sort Duration: 42803765 nanoseconds
Swaps = 55135
Comparisons = 4999

BUBBLE SORT: 
Low = 0
High = 99
Bubble Sort Duration: 193465579 nanoseconds
Swaps = 6255708
Comparisons = 6255708

SELECTION SORT: 
Low = 0
High = 99
Selection Sort Duration: 105978298 nanoseconds
Swaps = 4999
Comparisons = 4999

INSERTION SORT: 
Low = 0
High = 99
Insertion Sort Duration: 92086860 nanoseconds
Swaps = 6141293
Comparisons = 4999
```

The highs and lows were thrown out (as well as the highs and lows of the array for fun) when finding the averages.

## Make your final/judgement on best sort considering Data Structure loading, Comparisons, Swaps, Big O complexity, and Time.

Analysis on all the algorithms:
Note: only Big 0 is given because the other data is given above
* Merge: O(nLogn)
* Bubble: O(n2)
* Selection: O(n^2)
* Insertion: O(n)


The best algorithm: Insertion sort takes the least time, as it takes O(n) time to take. It takes the best time, structure, a high complexity but it is generally the most efficient with large numbers.
