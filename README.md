<h1 align="center"> 💻 Computer-Science-in-Java 💻 </h1>
<img src="https://i.imgur.com/dBaSKWF.gif" height="20" width="100%">
Intended for saving solutions for tests , exercises and assignments as part of an introductory course to computer science in the Java language at the Open University as part of a degree in computer science and physics 😎

<p align="center">
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/lironmiz/Computer-Science-in-Java?color=04D361&labelColor=000000">
  
 <img alt="Repository size" src="https://img.shields.io/github/repo-size/lironmiz/Computer-Science-in-Java?color=04D361&labelColor=000000">
  
  <a href="https://github.com/lironmiz/Link-Tree/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/lironmiz/Computer-Science-in-Java?color=04D361&labelColor=000000">
  </a>
</p>

Course material -

Part a :
Introduction and basics of the language

object oriented programming

flow control
(conditional sentences and loops)

arrays

Extending object-oriented programming - inheritance, static methods and variables, loading of methods, cases, polymorphism and interfaces

complications

Search and sort algorithms

Recursion

linked lists

Stacks and queues
 
Trees and Binary Trees
 
Computational

<!--🎨CAPSULE / 🌐WEBSITES: https://github.com/kyechan99/capsule-render -->
<p align="center">
<img src="https://capsule-render.vercel.app/api?type=shark&height=30&section=header&reversal=false&color=0:b579da,100:79da7f">

<!--🤖ASCIIART / 🌐WEBSITES: https://asciiart.website/ & https://github.com/github/markup/issues/1440#issuecomment-803889380 -->

<div align="center">
  
```diff
+@ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @+
@@       o o                                           @@
@@       | |                                           @@
@@      _L_L_                                          @@
@@   ❮\/__-__\/❯ Programming isn't about what you know @@
@@   ❮(|~o.o~|)❯  It's about what you can figure out   @@
@@   ❮/ \`-'/ \❯                                       @@
@@     _/`U'\_                                         @@
@@    ( .   . )     .----------------------------.     @@
@@   / /     \ \    | while( ! (succed=try() ) ) |     @@
@@   \ |  ,  | /    '----------------------------'     @@
@@    \|=====|/                                        @@
@@     |_.^._|                                         @@
@@     | |"| |                                         @@
@@     ( ) ( )   Testing leads to failure              @@
@@     |_| |_|   and failure leads to understanding    @@
@@ _.-' _j L_ '-._                                     @@
@@(___.'     '.___)                                    @@
+@ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @+
```
  
</div>
  
<!--🎨CAPSULE / 🌐WEBSITES: https://github.com/kyechan99/capsule-render -->
<p align="center">
<img src="https://capsule-render.vercel.app/api?type=shark&height=30&section=header&reversal=false&color=0:b579da,100:79da7f">

<!--🤖ASCIIART / 🌐WEBSITES: https://asciiart.website/ & https://github.com/github/markup/issues/1440#issuecomment-803889380 -->

<img src="https://i.imgur.com/dBaSKWF.gif" height="20" width="100%">

<h1 align="center"> 🤩 Computer-Science-in-Java-Summary 🤩 </h1>

## 1. TABLE OF CONTENTS
- [1. TABLE OF CONTENTS](#1-table-of-contents)
- [2. PRIMITIVE VARIABLES TYPES](#2-primitive-variables-types)
- [3. TAKING INPUT](#3-taking-input)
- [4. ARITHMETIC](#4-arithmetic)
- [5. CASTING](#5-casting)
- [6. RELATIONAL AND LOGICAL EXPRESSIONS](#6-relational-and-logical-expressions)
- [7. CONDITIONAL STATEMENTS](#7-conditional-statements)
- [8. LOOPS](#8-loops)
- [9. ARRAYS](#9-arrays)
- [10. SORTING ALGORITHMS](#10-sorting-algorithms)

## 2. PRIMITIVE VARIABLES TYPES
In Java, variables are used to store and manipulate data. There are several types of variables, each with its own characteristics and uses. 

| Definition | Example | Size | Range |
| --- | --- | --- | --- |
| char | 'b', 'B', '9', '&' | 1 byte | -2^7...2^7-1 (-128...127) |
| int | -5, 9, 8214 | 4 bytes | -2^31...2^31-1 |
| long | -3, 77, 8234 | 8 bytes | -2^63...2^63-1 |
| short | -1, 3, 1456 | 2 bytes | -2^15...2^15-1 |
| byte | -2, 8, 42 | 1 byte | -2^7...2^7-1 |
| double | 5.22, -89, 1.65 | 8 bytes | -1.7*10^308 to 1.7*10^308 |
| float | 44.22, -89, 8.6 | 4 bytes | -3.4*10^38 to 3.4*10^38 |
| boolean | true / false | 1 byte | true / false |

### 2.1 EXAMPLE
```java
  public class ExamplesOfBasicVariablesTypes
  {
    public static void main(String[] args)
    {
		  // define char
      char c = 'k';
      // define int 
      int num = 5;
      // define long
      long num1 = 765;
      // define sort
      sort num2 = 6;
      // define byte
      byte num3 = 32;
      // define double
      double num4 = 326;
      // define float
      float num5 = 89;
      // define boolean
      boolean bool = true;
	 }// end of method main 
  }// end of class ExamplesOfBasicVariablesTypes
```
## 3. TAKING INPUT
in this table we use: 
Scanner scan = new Scanner(System.in) <br>
In Java, there are several ways to take input from a user. Here the Scanner method:
(Remember to use the Scanner class you need to import it using import java.util.Scanner;
It should be used at the very beginning of your java file before any other code written.
So, you can use the methods in the table below after importing the class.)

| Data Type | Format |
| --- | --- |
| int | in.nextInt() |
| short | in.nextShort() |
| long | in.nextLong() |
| char | in.next().charAt(0) |
| float | in.nextFloat() |
| double | in.nextDouble() |
| byte | in.nextByte() |
| boolean | in.nextBoolean() |
| String | in.next() |
| A string across an entire line including spaces | in.nextLine() |

### 3.1 EXAMPLE
```java
import java.util.Scanner;

public class InputExample 
{
    public static void main(String[] args) 
    {
        // make a Scanner object
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int num1 = scan.nextInt();

        // Prompt user to enter a short
        System.out.print("Enter a short: ");
        short num2 = scan.nextShort();

        // Prompt user to enter a long
        System.out.print("Enter a long: ");
        long num3 = scan.nextLong();

        // Prompt user to enter a character
        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);

        // Prompt user to enter a float
        System.out.print("Enter a float: ");
        float num4 = scan.nextFloat();

        // Prompt user to enter a double
        System.out.print("Enter a double: ");
        double num5 = scan.nextDouble();

        // Prompt user to enter a byte
        System.out.print("Enter a byte: ");
        byte num6 = scan.nextByte();

        // Prompt user to enter a boolean
        System.out.print("Enter a boolean: ");
        boolean bool = scan.nextBoolean();

        System.out.println("You entered: " + num1 + ", " + num2 + ", " + num3 + ", " + ch + ", " + num4 + ", " + num5 + ", " + num6 + ", " + bool);
    }// end of method main
}// end of class InputExample
```

## 4. ARITHMETIC
In Java, arithmetic operations are used to perform mathematical calculations on variables.

| Operations | Symbol |
| --- | --- |
| Addition | + |
| Subtraction | - |
| Multiplication | * |
| Division | / |
| Modulus | % |

### 4.1 EXAMPLE

```java
public class Arithmetic
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 2;

        // addition
        int c = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + c);

        // subtraction
        c = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + c);

        // multiplication
        c = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + c);

        // division
        c = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + c);

        // modulus
        c = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + c);
    }// end of method main
    
}// end of class Arithmetic
```
### 4.2 SHORTHAND EXPRESSIONS 

| Shorthand Expressions | Symbol |
| --- | --- |
| Addition Assignment | += |
| Subtraction Assignment | -= |
| Multiplication Assignment | *= |
| Division Assignment | /= |
| Modulus Assignment | %= |

### 4.3 SHORTHAND EXPRESSIONS EXAMPLE
```java
public class ShorthandExpressions 
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 5;

        // addition assignment
        x += y;
        System.out.println("Addition Assignment: x += y : " + x);

        // subtraction assignment
        x -= y;
        System.out.println("Subtraction Assignment: x -= y : " + x);

        // multiplication assignment
        x *= y;
        System.out.println("Multiplication Assignment: x *= y : " + x);

        // division assignment
        x /= y;
        System.out.println("Division Assignment: x /= y : " + x);

        // modulus assignment
        x %= y;
        System.out.println("Modulus Assignment: x %= y : " + x);
    }// end of method main 
}// end of class ShorthandExpressions 
```
## 5. CASTING
In Java, casting is the process of converting one data type to another.

| Type | Description |
| --- | --- |
| Implicit casting | Also known as automatic casting, it occurs when a smaller type is converted to a larger type without the need for explicit casting. |
| Explicit casting | Also known as manual casting, it occurs when a larger type is converted to a smaller type. |

### 5.1 EXAMPLE

```java
public class Casting 
{
    public static void main(String[] args) 
    {
        // Implicit casting
        int a = 10;
        long b = a; // automatic casting from int to long

        // Explicit casting
        double c = 2.12;
        int d = (int)c; // explicit casting from double to int

        System.out.println("Implicit casting: int to long : " + b);
        System.out.println("Explicit casting: double to int : " + d);
    }// end of method main 
}// end of class Casting
```

## 6. RELATIONAL AND LOGICAL EXPRESSIONS

In Java, relational and logical expressions are used to make comparisons and control the flow of a program.

| Logical And Relational Expressions | Symbol | Description |
| --- | --- | --- |
| AND | && | Returns true if both operands are true |
| OR | \|\| | Returns true if one or both operands are true |
| NOT | ! | Returns true if the operand is false and false if the operand is true |
| Less than | < | Returns true if the left operand is less than the right operand |
| Less than or equal to | <= | Returns true if the left operand is less than or equal to the right operand |
| Greater than | > | Returns true if the left operand is greater than the right operand |
| Greater than or equal to | >= | Returns true if the left operand is greater than or equal to the right operand |
| Not equal to | != | Returns true if the operands are not equal |
| Equal to | == | Returns true if the operands are equal |

### 6.1 EXAMPLE

```java
public class RelationalAndLogicalExpressions
{
    public static void main(String[] args)
    {
        int a = 13;
        int b = 5;

        // relational greater than
        if (a > b)
        {
            System.out.println("a is greater than b");
        }

        // relational less than
        if (a < b)
        {
            System.out.println("a is less than b");
        }

        // relational greater than or equal to
        if (a >= b)
        {
            System.out.println("a is greater than or equal to b");
        }

        // relational less than or equal to
        if (a <= b)
        {
            System.out.println("a is less than or equal to b");
        }

        // relational equal to
        if (a == b)
        {
            System.out.println("a is equal to b");
        }

        // relational not equal to
        if (a != b)
        {
            System.out.println("a is not equal to b");
        }

        // logical AND
        if (a > b && a < 20)
        {
            System.out.println("a is greater than b and less than 20");
        }

        // logical OR
        if (a > b || a < 20)
        {
            System.out.println("a is either greater than b or less than 20");
        }

        // logical NOT
        if (!(a == b))
        {
            System.out.println("a is not equal to b");
        }
    }// end of method main
}// end of class RelationalAndLogicalExpressions
```

## 7. CONDITIONAL STATEMENTS
In Java, conditional statements are used to control the flow of a program based on certain conditions. The most basic and commonly used conditional statement is the if statement.

### 7.1 IF STATEMENT

The if statement allows you to execute a block of code only if a certain condition is true. The basic syntax for an if statement is as follows:

| Syntax | Description |
| --- | --- |
| `if (condition) ` <br> ` {` <br> `// code to be executed if the condition is true` <br> `}` | Executes a block of code if the specified condition is true |
| `if (condition) ` <br> ` {` <br> `// code to be executed if the condition is true` <br> `} ` <br> ` else ` <br> ` {` <br> `// code to be executed if the condition is false` <br> `}` | Executes a block of code if the specified condition is true, and another block of code if the condition is false |
| `if (condition1) ` <br> ` {` <br> `// code to be executed if condition1 is true` <br> `} ` <br> ` else if ` <br> ` (condition2) {` <br> `// code to be executed if condition2 is true` <br> `} ` <br> ` else ` <br> ` {` <br> `// code to be executed if both conditions are false` <br> `}` | Executes a block of code for the first true condition, and another block of code if none of the conditions are true |

### 7.2 EXAMPLE

```java
public class IfElseExample
{
    public static void main(String[] args)
    {

        int age = 40;

        // if statement
        if (age >= 18)
        {
            System.out.println("You are an adult.");
        }

        // if-else statement
        if (age >= 21)
        {
            System.out.println("You can drink alcohol.");
        } 
        else
        {
            System.out.println("You cannot drink alcohol.");
        }

        // if-if-else-else statement
        if (age >= 65)
        {
            System.out.println("You are a senior citizen.");
        } 
        else if (age >= 18)
        {
            System.out.println("You are an adult.");
        }
        else
        {
            System.out.println("You are a minor.");
        }
    }// end of method main 
}// end of class IfElseExample
```

### 7.3 SWITCH STATEMENT

A switch statement in Java is used to execute different code based on the value of an expression. The expression is evaluated, and the corresponding branch of the switch statement is executed. 

### 7.4 EXAMPLE

```java
public class WeekDayChecker 
{
    public static void main(String[] args)
    {
        int day = 2;
        // switch statement to check the day of the week
        switch(day)
	{
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
                break;
        }
    }// end of method main
}// end of class WeekDayChecker 
```
## 8. LOOPS

Java provides several types of loops for different use cases:

| Loop Type | Description | Best use |
| --- | --- | --- |
| for | Iterating through a range of values or an array | Counting loops |
| while | Executing a block of code as long as a certain condition is true | Conditional loops |
| do-while | Executing a block of code at least once before the condition is checked | Loop should always execute at least one time |

Additionally, Java provides two keywords for controlling the flow of loops:

| Keyword | Description |
| --- | --- |
| break | Break out of a loop early |
| continue | Skip an iteration of a loop |

### 8.1 FOR LOOP

A for loop is used for iterating through a range of values or an array. It consists of three parts:

1. initialization
2. termination condition
3. increment/decrement.

### 8.2 FOR LOOP EXAMPLE

```java
public class ForLoopExample
{
    public static void main(String[] args) 
    {
        // for loop to print the numbers from 0 to 10
        for (int i = 0; i < 11; i++)
	{
            System.out.println(i);
     	}// end of for loop
    }// end of method main
}// end of class ForLoopExample
```
### 8.3 WHILE LOOP
While loop in Java consists of two parts: initialization and termination condition

Initialization : set the initial value for the loop variable before the start of the loop.

Termination condition: the condition that must be met for the loop to continue, if the condition is true the code inside the loop is executed, otherwise the loop is terminated.

It is important to be sure that the termination condition will be false at some point, otherwise the loop will keep running forever, this is called an infinite loop.
### 8.4 WHILE LOOP EXAMPLE
```java
public class WhileLoopExample
{
    public static void main(String[] args)
    {
        int i = 0; // initialization
        // while loop to iterate through numbers 0 to 10
        while (i < 11) // termination condition
	{ 
            System.out.println(i);
            i++; // increment
        }// end of while loop
    }// end of method main
}// end of class WhileLoopExample
```
### 8.5 DO WHILE LOOP
Do-while loop in Java consists of two parts: initialization and termination condition

Initialization : set the initial value for the loop variable before the start of the loop.

Termination condition: the condition that must be met for the loop to continue, if the condition is true the code inside the loop is executed, otherwise the loop is terminated.

The main difference between a while loop and a do-while loop is that the code inside a do-while loop is executed at least once before the termination condition is checked.
It's important to be sure that the termination condition will be false at some point, otherwise the loop will keep running forever, this is called an infinite loop.

### 8.6 DO WHILE LOOP EXAMPLE
```java
public class DoWhileLoopExample
{
    public static void main(String[] args)
    {
        int counter = 0;
        do 
	{
            System.out.println(counter);
            counter++;
        } while (counter < 10);
    }// end of method main
}// end of class DoWhileLoopExample
```
## 9. ARRAYS

| Concept | Description |
|----------|-------------|
| Array | A container object that holds a fixed number of values of a single type. |
| Creating an Array | Use the keyword "new" followed by the data type of the array and the size of the array in brackets.  |
| Accessing Array Elements | Elements can be accessed using their index, which starts at 0. |
| Modifying Array Elements | Elements can be modified by assigning a new value to a specific index. |
| Array Methods | Java provides various methods in the Arrays class for sorting, searching, and manipulating arrays. |

### 9.1 ONE DIMENSIONAL ARRAY EXAMPLE
```java
class OneDimensionalArrayExample
{
    public static void main(String[] args)
    {
        // Declare a one-dimensional array of integers
        int[] myArray = new int[5];

        // Assign values to the elements of the array
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
	// the array
	//  - - - - -
	// |1|2|3|4|5|
	//  - - - - -
        // Print out the third element of the array
        System.out.println("The third element of the array is: " + myArray[2]);
    }// end of method main 
}// end of method OneDimensionalArrayExample
```
### 9.2 TWO DIMENSIONAL ARRAY 
| Key Point  | Description |
| ---------- | ----------- |
| Size       | The size of a two-dimensional array is the number of rows multiplied by the number of columns |
| Usage       | Two-dimensional arrays are typically used to store and manipulate data in a tabular format |
| Creation    | They can be created using the `new` keyword and specifying the number of rows and columns |
| Accessing Elements | Elements in a two-dimensional array can be accessed using the `array[row][column]` notation |
| Iteration | They can be iterated using nested loops to access each element individually |
| Pass as a parameter | They can be passed as a parameter to a method just like a one-dimensional array |
| Applications | Two-dimensional arrays are commonly used in many applications such as image processing, game development, and scientific computing.

### 9.3 TWO DIMENSIONAL ARRAY EXAMPLE
```java
public class TwoDimensionalArrayExample
{
    public static void main(String[] args)
    {
    	// create a 2D array with 3 rows and 3 columns
        // and initialize it with values
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        System.out.println("The original array:");
        //printing the original array using two for loops
        for (int i = 0; i < arr.length; i++)
	{
            for (int j = 0; j < arr[i].length; j++)
	    {
                System.out.print(arr[i][j] + " ");
            }// end of nested loop
            System.out.println();
        }// end of first loop

        //modifying the array
        arr[1][2] = 8;

        System.out.println("\nThe modified array:");
        //printing the modified array
        for (int i = 0; i < arr.length; i++)
	{
            for (int j = 0; j < arr[i].length; j++)
	    {
                System.out.print(arr[i][j] + " ");
            }// end of nested loop
            System.out.println();
        }// end of first loop
    }// end of method main
}// TwoDimensionalArrayExample
```
### the table after the code: 

| 1 | 2 | 3 |
|:-:|---|---|
| 4 | 5 | 8 |
| 7 | 8 | 9 |

## 10. SORTING ALGORITHMS

Sorting algorithms are used to order a collection of items in a specific way. 

summary of some common sorting algorithms:

| Algorithm | Best Case | Worst Case | Average Case | Space Complexity |
|-----------|-----------|------------|--------------|------------------|
| bubble sort|  O(n)     | O(n^2)     |   O(n^2)     |       O(1)       |
| insertion sort| O(n)    | O(n^2)     |   O(n^2)     |       O(1)       |
| selection sort| O(n^2)  | O(n^2)     |   O(n^2)     |       O(1)       |
| merge sort | O(n log n)| O(n log n) | O(n log n)   |       O(n)       |
| quick sort  | O(n log n)| O(n^2)     | O(n log n)   |       O(log n)   |
| heap sort   | O(n log n)| O(n log n) | O(n log n)   |       O(1)       |

### 10.1 bubble sort

Bubble sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. It repeatedly passes through the list, comparing elements and swapping them as needed, until the list is sorted.

**Time Complexity**:

**Best Case:** O(n) when the list is already sorted, no swapping will be done.

**Worst Case:** O(n^2) when the list is reverse sorted, each element will be compared n times before getting to its correct position.

**Average Case:** O(n^2)

**Space Complexity:** O(1) as it only uses a single additional memory space to keep track of the last swap.

**Stability:** Stable, it preserves the relative order of elements with equal values.

**In-Place:** Yes, it doesn't require extra memory to perform the sort.
```java
class BubbleSort
{
    public static void main(String[] args)
    {
    	// the array before sorting 
        int[] arr = {5, 3, 8, 6, 2, 1, 9, 4, 7};
	// print the array before sorting 
        System.out.println("Original Array: " + Arrays.toString(arr));
	// sort the array
        bubbleSort(arr);
	// print the array after sorting 
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }// end of method main
 
    public static void bubbleSort(int[] arr)
    {
        int temp;
        for (int i = 0; i < arr.length - 1; i++)
	{
            for (int j = 1; j < arr.length - i; j++)
	    {
                if (arr[j - 1] > arr[j])
		{
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }// end of if 
            }// end of nested for loops 
        }// end of for loop
    }// end of method bubbleSort
}// end of class BubbleSort
```
### 10.2 insertion sort
Insertion sort is a simple sorting algorithm that builds up the final sorted list one item at a time, by inserting each new item into its correct position in the already sorted portion of the list.

**Time Complexity**:

**Best Case:** O(n) when the list is already sorted, each element will be inserted in the first position.

**Worst Case:** O(n^2) when the list is reverse sorted, each element will be compared n times before 
getting to its correct position.

**Average Case:** O(n^2)

**Space Complexity:** O(1) as it only uses a single additional memory space to keep track of the current element and its position.

**Stability:** Stable, it preserves the relative order of elements with equal values.

**In-Place:** Yes, it doesn't require extra memory to perform the sort.

```java
class InsertionSort
{
    public static void main(String[] args)
    {
    	// the array before sorting 
        int[] arr = {5, 3, 8, 6, 2, 1, 9, 4, 7};
	// print the array before sorting 
        System.out.println("Original Array: " + Arrays.toString(arr));
	// sort the array
        insertionSort(arr);
	// print the array after sorting 
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }// end of method main 
 
    public static void insertionSort(int[] arr)
    {
        int key, j;
        for (int i = 1; i < arr.length; i++)
	{
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)
	    {
                arr[j + 1] = arr[j];
                j = j - 1;
            }// end of while loop
            arr[j + 1] = key;
        }// end of foor loop 
    }// end of method insertionSort
}// end of class InsertionSort
```
### 10.3 selection sort 

election sort is a simple sorting algorithm that repeatedly selects the smallest (or largest) element from the unsorted portion of the list and moves it to the sorted portion. It repeatedly finds the minimum element from the unsorted part and moves it to the end of the sorted array.

**Time Complexity**:

**Best Case:** O(n^2) when the list is already sorted or reverse sorted.

**Worst Case:** O(n^2) when the list is reverse sorted.

**Average Case:** O(n^2)

**Space Complexity:** O(1) as it only uses a single additional memory space to keep track of the current minimum element and its position.

**Stability:** Unstable, it doesn't preserves the relative order of elements with equal values.

**In-Place:** Yes, it doesn't require extra memory to perform the sort.

```java
public class SelectionSort
{

    public static void main(String[] args)
    {
        int[] arr = {5, 3, 6, 2, 10};
	
        // Print the original array
        System.out.print("Original Array: ");
        for (int i : arr)
	{
            System.out.print(i + " ");
        }// end of for loop 

        // Sort the array using selection sort
        selectionSort(arr);

        // Print the sorted array
        System.out.print("\nSorted Array: ");
        for (int i : arr)
	{
            System.out.print(i + " ");
        }// end of for loop 
    }// end of method main

    public static void selectionSort(int[] arr)
    {
        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++)
	{
            // Find the index of the minimum element
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
	    {
                if (arr[j] < arr[minIndex])
		{
                    minIndex = j;
                }// end of if
            }// end of for loop
            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }// end of for loop
    }// end of method selectionSort
}// end of class SelectionSort
```

### 10.4 merge sort 
Merge sort is a divide-and-conquer sorting algorithm that repeatedly divides an array or list into two halves until each half contains only one element, and then combines them back together in a sorted order.

The algorithm begins by dividing the array into two equal halves.

It then recursively sorts each half by calling the merge sort function on each half.

Once both halves are sorted, the merge function is called to merge the two sorted halves back together, in a sorted order.

The merge function compares the first element of each half and adds the smaller element to a new array. It then continues this process until one half is exhausted and adds the remaining elements of the other half.

The new array is then returned as the sorted version of the original array.

The merge sort algorithm has a time complexity of O(n log n), making it more efficient than other sorting algorithms such as bubble sort or insertion sort. It is a stable sort, meaning that it preserves the relative order of elements with equal keys. It also requires O(n) extra space to perform the sorting.
