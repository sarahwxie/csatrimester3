# MC test Corrections

Proof of completion:
![](static/photos/slay.PNG)


**Question 10**

```
Consider the following method.

public static void printSome(int num1, int num2)

{

for (int i = 0; i < num1; i++)

{

if (i % num2 == 0 && i % 2 == 0)

{

System.out.print(i + " ");

}

}

}

Which of the following method calls will cause "0 10 " to be printed?

```

The correct answer was `printSome(20,5)` when I put `printSome(10,5)`.
I didn't trace through the function correctly

**Question 21**

```
Consider the following method.

public static String[] strArrMethod(String[] arr)

{

String[] result = new String[arr.length];

for (int j = 0; j < arr.length; j++)

{

String sm = arr[j];

for (int k = j + 1; k < arr.length; k++)

{

if (arr[k].length() < sm.length())

{

sm = arr[k]; // Line 12

}

}

result[j] = sm;

}

return result;

}

Consider the following code segment.

String[] testOne = {"first", "day", "of", "spring"};

String[] resultOne = strArrMethod(testOne);

What are the contents of resultOne when the code segment has been executed?
```

I answered B, while the correct answer is D (with only of of of and spring).


**Question 22**

```
Consider the following method.

public static String[] strArrMethod(String[] arr)

{

String[] result = new String[arr.length];

for (int j = 0; j < arr.length; j++)

{

String sm = arr[j];

for (int k = j + 1; k < arr.length; k++)

{

if (arr[k].length() < sm.length())

{

sm = arr[k]; // Line 12

}

}

result[j] = sm;

}

return result;

}

Consider the following code segment.

String[] testTwo = {"last", "day", "of", "the", "school", "year"};

String[] resultTwo = strArrMethod(testTwo);

How many times is the line labeled // Line 12 in the strArrMethod executed as a result of executing the code segment?
```

I answered A, while the correct asnwer should have been B (5 times)


The remaining questions, I guessed on. This weekend, I will be alloting time to complete them for real, because I would like to see my real ability.
