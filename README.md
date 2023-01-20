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

# Course Material 💼

+ Introduction And Basics Of The Language

+ Object Oriented Programming

+ Flow Control (conditional sentences and loops)

+ Arrays

+ Extending Object-Oriented-Programming - inheritance, static methods and variables, loading of methods, cases, polymorphism and interfaces

+ Complications

+ Search And Sort Algorithms

+ Recursion

+ Linked Lists

+ Stacks And Queues
 
+ Trees And Binary Trees
 
+ Computational

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
- [11. SEARCHING ALGORITHMS](#11-searching-algorithms)
- [12. MATH CLASS](#12-math-class)
- [13. STRING CLASS](#13-string-class)
- [14. STRING BUFFER CLASS](#14-string-buffer-class)
- [15. METHODS](#15-methods)
- [16. RANDOM NUMBERS](#16-random-numbers)
- [17. RECURSION](#17-recursion)
- [18. READ AND WRITE TO FILE](#18-read-and-write-to-file)
- [19. LINKED LIST](#19-linked-list)

<img src="https://media.giphy.com/media/bpEH21sHkWQQ8/giphy.gif">

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

### 2.1 Example 
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
<img src="https://media.giphy.com/media/RkclJYmYQmCrOPQFZn/giphy.gif">

## 3. TAKING INPUT

<img src="https://media.giphy.com/media/ZBEMh8FGeNANCeBaEd/giphy.gif">

in this table we use: 
Scanner scan = new Scanner(System.in) <br>
In Java, there are several ways to take input from a user. 

**Here the Scanner method**:

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

### 3.1 Example 
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

<img src="https://media.giphy.com/media/5UCpmbzvZKQCfuF2P2/giphy.gif">

| Operations | Symbol |
| --- | --- |
| Addition | + |
| Subtraction | - |
| Multiplication | * |
| Division | / |
| Modulus | % |

### 4.1 Example 

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
### 4.2 Shorthand Experssions 

| Shorthand Expressions | Symbol |
| --- | --- |
| Addition Assignment | += |
| Subtraction Assignment | -= |
| Multiplication Assignment | *= |
| Division Assignment | /= |
| Modulus Assignment | %= |

### 4.3 Shorthand Experssions Example
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

<img src="https://media.giphy.com/media/C9iYoljYrwIISmWBWg/giphy.gif">

| Type | Description |
| --- | --- |
| Implicit casting | Also known as automatic casting, it occurs when a smaller type is converted to a larger type without the need for explicit casting. |
| Explicit casting | Also known as manual casting, it occurs when a larger type is converted to a smaller type. |

### 5.1 Example

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

<img src="https://media.giphy.com/media/2aWxyHllMdWS07RCnU/giphy.gif">

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

### 6.1 Example 

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

<img src="https://media.giphy.com/media/mDN2PrgD9VuQJG0LY2/giphy-downsized.gif">

### 7.1 If Statement

The if statement allows you to execute a block of code only if a certain condition is true. The basic syntax for an if statement is as follows:

| Syntax | Description |
| --- | --- |
| `if (condition) ` <br> ` {` <br> `// code to be executed if the condition is true` <br> `}` | Executes a block of code if the specified condition is true |
| `if (condition) ` <br> ` {` <br> `// code to be executed if the condition is true` <br> `} ` <br> ` else ` <br> ` {` <br> `// code to be executed if the condition is false` <br> `}` | Executes a block of code if the specified condition is true, and another block of code if the condition is false |
| `if (condition1) ` <br> ` {` <br> `// code to be executed if condition1 is true` <br> `} ` <br> ` else if ` <br> ` (condition2) {` <br> `// code to be executed if condition2 is true` <br> `} ` <br> ` else ` <br> ` {` <br> `// code to be executed if both conditions are false` <br> `}` | Executes a block of code for the first true condition, and another block of code if none of the conditions are true |

### 7.2 Example 

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

### 7.3 Switch Statement

A switch statement in Java is used to execute different code based on the value of an expression. The expression is evaluated, and the corresponding branch of the switch statement is executed. 

### 7.4 Example

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

<img src="https://media.giphy.com/media/ieaUdBJJC19uw/giphy-downsized-large.gif">

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

### 8.1 For Loop

A for loop is used for iterating through a range of values or an array. It consists of three parts:

1. initialization
2. termination condition
3. increment/decrement.

### 8.2 For Loop Example

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
### 8.3 While Loop
While loop in Java consists of two parts: initialization and termination condition

Initialization : set the initial value for the loop variable before the start of the loop.

Termination condition: the condition that must be met for the loop to continue, if the condition is true the code inside the loop is executed, otherwise the loop is terminated.

It is important to be sure that the termination condition will be false at some point, otherwise the loop will keep running forever, this is called an infinite loop.
### 8.4 While Loop Example
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
### 8.5 Do While Loop
Do-while loop in Java consists of two parts: initialization and termination condition

Initialization : set the initial value for the loop variable before the start of the loop.

Termination condition: the condition that must be met for the loop to continue, if the condition is true the code inside the loop is executed, otherwise the loop is terminated.

The main difference between a while loop and a do-while loop is that the code inside a do-while loop is executed at least once before the termination condition is checked.

It's important to be sure that the termination condition will be false at some point, otherwise the loop will keep running forever, this is called an infinite loop.

### 8.6 Do While Loop Example
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

<img src="https://media.giphy.com/media/LYBHgc2yiO07G3dkkQ/giphy.gif">

| Concept | Description |
|----------|-------------|
| Array | A container object that holds a fixed number of values of a single type. |
| Creating an Array | Use the keyword "new" followed by the data type of the array and the size of the array in brackets.  |
| Accessing Array Elements | Elements can be accessed using their index, which starts at 0. |
| Modifying Array Elements | Elements can be modified by assigning a new value to a specific index. |
| Array Methods | Java provides various methods in the Arrays class for sorting, searching, and manipulating arrays. |

### 9.1 One Dimensional Array Example
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
### 9.2 Two Dimensional Array 
| Key Point  | Description |
| ---------- | ----------- |
| Size       | The size of a two-dimensional array is the number of rows multiplied by the number of columns |
| Usage       | Two-dimensional arrays are typically used to store and manipulate data in a tabular format |
| Creation    | They can be created using the `new` keyword and specifying the number of rows and columns |
| Accessing Elements | Elements in a two-dimensional array can be accessed using the `array[row][column]` notation |
| Iteration | They can be iterated using nested loops to access each element individually |
| Pass as a parameter | They can be passed as a parameter to a method just like a one-dimensional array |
| Applications | Two-dimensional arrays are commonly used in many applications such as image processing, game development, and scientific computing.

### 9.3 Two Dimensional Array Example
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

<img src="https://media.giphy.com/media/ezjd4NlY4w3io/giphy-downsized.gif">

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

### 10.1 Bubble Sort

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
    /**
    * sort the array using bubble sort method 
    * @param array - the original array
    * @return None
    */
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
### 10.2 Insertion Sort
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
    /**
    * sort the array using insertion sort sort method 
    * @param array - the original array
    * @return None
    */
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
### 10.3 Selection Sort 

election sort is a simple sorting algorithm that repeatedly selects the smallest (or largest) element from the unsorted portion of the list and moves it to the sorted portion.

It repeatedly finds the minimum element from the unsorted part and moves it to the end of the sorted array.

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
    /**
    * sort the array using selection sort method 
    * @param array - the original array
    * @return None
    */
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

### 10.4 Merge Sort 
Merge sort is a divide-and-conquer sorting algorithm that repeatedly divides an array or list into two halves until each half contains only one element, and then combines them back together in a sorted order.

The algorithm begins by dividing the array into two equal halves.

It then recursively sorts each half by calling the merge sort function on each half.

Once both halves are sorted, the merge function is called to merge the two sorted halves back together, in a sorted order.

The merge function compares the first element of each half and adds the smaller element to a new array. It then continues this process until one half is exhausted and adds the remaining elements of the other half.

The new array is then returned as the sorted version of the original array.

The merge sort algorithm has a time complexity of O(n log n), making it more efficient than other sorting algorithms such as bubble sort or insertion sort. It is a stable sort, meaning that it preserves the relative order of elements with equal keys. It also requires O(n) extra space to perform the sorting.

```java
public class MergeSort 
{
    public static void main(String[] args) 
    {
        int[] array = {5, 1, 9, 3, 7, 6, 8, 2, 4};
        mergeSort(array);
        for (int i : array) 
	{
            System.out.print(i + " ");
        }// end of for 
    }// end of main method 
	
    /**
    * Sorts an array using the merge sort algorithm
    * @param: array - the array to be sorted
    * @return: None
    */
    public static void mergeSort(int[] array) 
    {
        if (array.length > 1) 
	{
	    // Split the array into left and right halves
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
	    
	    // Recursively sort the left and right halves
            mergeSort(left);
            mergeSort(right);
            // Merge the sorted left and right halves back together
            merge(array, left, right);
        }
    }// end of mergeSort method 
    /**
    * Returns the left half of an array
    * @param array - the original array
    * @return array - the left half of the array
    */
    public static int[] leftHalf(int[] array) 
    {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++)
	{
            left[i] = array[i];
        }
        return left;
    }// end of leftHalf method 
    /**
    * Returns the right half of an array
    * @param array - the original array
    * @return array - the right half of the array
    */
    public static int[] rightHalf(int[] array)
    {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }// end of method rightHalf
    /**
    * Merges two sorted arrays into a single sorted array
    * @param result - the final sorted array, left - the left half of the array, right - the right half of the array
    @ @return None
    */
    public static void merge(int[] result, int[] left, int[] right)
    {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++)
	{
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2]))
	    {
                result[i] = left[i1];
                i1++;
            }
	    else
	    {
                result[i] = right[i2];
                i2++;
            }
        }// end of for loop 
    }// end of merge method 
}// end of class  MergeSort
```
### 10.5 Quick Sort 
Quick Sort is a sorting algorithm that uses the divide-and-conquer strategy to sort an array or a list of elements.

The basic idea behind the algorithm is to partition the array into two sub-arrays, one containing elements that are less than a chosen pivot element, and the other containing elements that are greater than the pivot.

The pivot element can be chosen in different ways, but a common approach is to select the last element of the array as the pivot.

Once the array is partitioned, the pivot element is in its final position in the sorted array. The algorithm then recursively sorts the left and right sub-arrays.
```java
public class QuickSort
{

    public static void main(String[] args)
    {
        int[] array = {5, 1, 9, 3, 7, 6, 8, 2, 4};
        sort(array);
        for (int i : array)
	{
            System.out.print(i + " ");
        }
    }// end of main method 

    /**
    * Sorts an array using the quick sort algorithm
    * @param array - the array to be sorted
    * @return none
    */
    public static void sort(int[] array)
    {
        sort(array, 0, array.length - 1);
    }// end of sort method 

    /**
    * Sorts an array within a given range using the quick sort algorithm
    * @param array - the array to be sorted, int - low - the lower bound of the range to be sorted int - high - the upper bound of the range to be sorted
    * @return None
    */
    private static void sort(int[] array, int low, int high)
    {
        if (low < high)
	{
            // Choose pivot and partition the array
            int pivotIndex = partition(array, low, high);
            // Recursively sort the left and right partitions
            sort(array, low, pivotIndex);
            sort(array, pivotIndex + 1, high);
        }
    }// end of sort method 

    /**
    * Partitions an array within a given range and returns the pivot index
    * @param array - the array to be partitioned, int - low - the lower bound of the range to be partitioned, int high - the upper bound of the range to be partitioned
    * @return the pivot index
    */
    private static int partition(int[] array, int low, int high)
    {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++)
	{
            if (array[j] <= pivot)
	    {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap array[i + 1] and array[high]
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }// end of partition method 
}// end of QuickSort class 
```
### 10.6 Heap Sort 
Heap sort is a comparison-based sorting algorithm that is based on the binary heap data structure.

In Java, it can be implemented by first creating a max heap out of the input array, and then repeatedly extracting the maximum element from the heap and placing it at the end of the sorted array. 

The process continues until the heap is empty, resulting in a sorted array in ascending order. It has a time complexity of O(n log n) and requires O(1) extra space.
```java
class HeapSort
{

    // Heap sort method
    public static void heapSort(int[] arr)
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
	{
	   heapify(arr, n, i);
	}
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
	{
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }// end of method heapSort

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int[] arr, int n, int i) 
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
	{
	   largest = l;
	}
            
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
	{
	     largest = r;
	}
	
        // If largest is not root
        if (largest != i)
	{
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }// end of heapify method 

    public static void main(String args[])
    {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);

        System.out.println("Sorted array is:");
        for (int i=0; i<arr.length; ++i)
	{
	    System.out.print(arr[i]+" ");
	}      
    }// end of main method 
}// end of class HeapSort
```
## 11. SEARCHING ALGORITHMS

<img src="https://media.giphy.com/media/HdkzWcDvoRmLmkrWOt/giphy.gif" >

Searching algorithms are a set of methods used to locate specific data within a larger data set. 

The most common types of searching algorithms include linear search, binary search, jump search, interpolation search, depth-first search, and breadth-first search.

| Algorithm        | Time Complexity           | Space Complexity |
| ------------------|--------------------------|------------------|
| Linear Search     | O(n)                      | O(1)             |
| Binary Search     | O(log n)                  | O(1)             |
| Jump Search       | O(√n)                     | O(1)             |
| Interpolation Search | O(log log n)             | O(1)             |
| Depth First Search| O(V + E)                   | O(V)             |
| Breadth First Search| O(V + E)                  | O(V)    

### 11.1 Linear Search
inear search is the simplest search algorithm and involves iterating through each element of the data set until the desired element is found.

The time complexity for this algorithm is O(n), where n is the number of elements in the data set.

```java
public class LinearSearch
{
    /**
    * Method to implement Linear Search algorithm to find a specific element in an array. 
    * If the element doesn't exist in the array, the method returns -1.
    * @param array - array, int x - the number we want to find  
    * @return int 
    */
    public static int linearSearch(int[] arr, int x)
    {
        for (int i = 0; i < arr.length; i++)
	{
            if (arr[i] == x)
	    {
                return i;
            }
        }
        return -1;
    }// end of linearSearch method 

    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        int result = linearSearch(arr, x);
        if (result == -1)
	{
            System.out.println("Element not present in array.");
        } 
	else
	{
            System.out.println("Element found at index: " + result);
        }
    }// end of main method 
}// end of class LinearSearch
```

### 11.1 Binary Search 
Binary search is a more efficient search algorithm that works by repeatedly dividing the search interval in half.

The time complexity for this algorithm is O(log n), which makes it more efficient than linear search for large data sets.
```java
public class BinarySearch
{
    /**
    * Method to implement Binary Search algorithm to find a specific element in an array. 
    * If the element doesn't exist in the array, the method returns -1.
    * @param array, int x
    * @return int 
    */
    public static int binarySearch(int[] arr, int x)
    {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right)
	{
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
	    {
                return mid;
            } 
	    else if (arr[mid] < x)
	    {
                left = mid + 1;
            }
	    else
	    {
                right = mid - 1;
            }
        }
        return -1;
    }// end of method binarySearch

    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        int result = binarySearch(arr, x);
        if (result == -1)
	{
            System.out.println("Element not present in array.");
        }
	else
	{
            System.out.println("Element found at index: " + result);
        }
    }// end of main method 
}// end of class BinarySearch
```

### 11.2 Jump Search
Jump search is an algorithm that works by jumping a fixed number of elements at a time instead of iterating through each element. The time complexity for this algorithm is O(√n).

```java
public class JumpSearch
{
    /**
    * Method to implement Jump Search algorithm to find a specific element in an array. 
    * If the element doesn't exist in the array, the method returns -1.
    * @param array - the array to search through, int x - the element to search for
    * @return int - the index of the element if found, -1 if not found
    */
    public static int jumpSearch(int[] array, int x)
    {
        int n = array.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;
        while (array[Math.min(step, n) - 1] < x)
	{
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n)
	    {
                return -1;
            }
        }
        while (array[prev] < x)
	{
            prev++;
            if (prev == Math.min(step, n))
	    {
                return -1;
            }
        }
        if (array[prev] == x)
	{
            return prev;
        }
        return -1;
    }// end of method jumpSearch

    public static void main(String[] args)
    {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int x = 55;
        int index = jumpSearch(array, x);
        if (index != -1)
	{
            System.out.println("Element found at index: " + index);
        }
	else
	{
            System.out.println("Element not found in array.");
        }
    }// end of main method 
}// end of class JumpSearch
```
### 11.3 Interpolation Search
Interpolation search is a search algorithm for sorted arrays. 

It works by making an educated guess about the position of the element in the array, based on the value of the element and the range of values in the array. 

The algorithm then repeatedly narrows down the search space by determining if the guessed position is too high or too low, and then updating the guess based on this information.

The algorithm terminates when the element is found or when the search space has been narrowed down to a single element that is not the target.

Interpolation search is faster than a typical binary search when the elements in the array are uniformly distributed.

```java
public class InterpolationSearch
{
    /**
    * Method to implement Interpolation Search algorithm to find a specific element in an array. 
    * If the element doesn't exist in the array, the method returns -1.
    * @param array - the array to search through, int x - the element to search for
    * @return int - the index of the element if found, -1 if not found
    */
    public static int interpolationSearch(int[] array, int x)
    {
        int low = 0;
        int high = array.length - 1;
        while (low <= high && x >= array[low] && x <= array[high])
	{
            int pos = low + (((high - low) / (array[high] - array[low])) * (x - array[low]));
            if (array[pos] == x)
	    {
                return pos;
            }
            if (array[pos] < x)
	    {
                low = pos + 1;
            } 
	    else
	    {
                high = pos - 1;
            }
        }
        return -1;
    }// end of method interpolationSearch

    public static void main(String[] args)
    {
        int[] array = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x = 18;
        int index = interpolationSearch(array, x);
        if (index != -1)
	{
            System.out.println("Element found at index: " + index);
        } 
	else
	{
            System.out.println("Element not found in array.");
        }
    }// end of main method 
}// end of InterpolationSearch class 
```
### 11.4 Depth First Search
Depth First Search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking.

It starts at a specific vertex (or source node) and visits each vertex in the graph by following each edge as far as possible before backtracking.

DFS can be implemented using a stack data structure, where the vertices that have yet to be visited are pushed onto the stack, and the last vertex added to the stack is the next vertex to be visited.

The algorithm terminates when all vertices have been visited or when a specific goal vertex is found. DFS can be used to find the connected components of a graph, solve puzzles and games, and find the paths between two vertices in a graph.

```java
import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearch
{
    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val)
	{
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }// end of class TreeNode

    /**
     * Method to implement Depth First Search algorithm to find a specific element in a tree.
     * If the element doesn't exist in the tree, the method returns false.
     * @param root - the root of the tree, int x - the element to search for
     * @return boolean - true if the element is found, false if not found
     */
      public static boolean dfs(TreeNode root, int x)
      {
        if (root == null)
	{
            return false;
        }
        if (root.val == x)
	{
            return true;
        }
        boolean left = dfs(root.left, x);
        boolean right = dfs(root.right, x);
        return left || right;
      }// end of method dfs

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int x = 4;
        boolean found = dfs(root, x);
        if (found)
	{
            System.out.println("Element found in tree.");
        }
	else
	{
            System.out.println("Element not found in tree.");
        }
    }// end of method main
}// end of class DepthFirstSearch
```
### 11.5 Breadth First Search
Breadth First Search (BFS) is a graph traversal algorithm that visits all the vertices of a graph in breadth-first order, meaning it visits all the vertices at a given depth level before moving on to the next level. 

It starts at a specific vertex (or source node) and visits all its neighboring vertices first, before visiting the vertices at the next level.

BFS can be implemented using a queue data structure, where the vertices to be visited are added to the queue, and the first vertex in the queue is the next vertex to be visited.

The algorithm terminates when all vertices have been visited or when a specific goal vertex is found. BFS can be used to find the shortest path between two vertices in a graph, find the connected components of a graph and solve puzzles and games.

```java
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch
{
    /**
    * method find a specific element in a tree using breadth first search
    * if the element is not found, the method returns -1
    * @param Node root - the root of the tree, int x - the element to search for
    * @return int - the value of the element if found, -1 if not found
    */
    public static int bfs(Node root, int x)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
	{
            Node current = queue.poll();
            if (current.value == x)
	    {
                return current.value;
            }
            if (current.left != null)
	    {
                queue.add(current.left);
            }
            if (current.right != null)
	    {
                queue.add(current.right);
            }
        }

        return -1;
      }// end of method bfs

    public static void main(String[] args)
    {
        // create a sample tree for demonstration
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int elementToFind = 4;
        int result = bfs(root, elementToFind);
        System.out.println("Value of element " + elementToFind + ": " + result);
    }// end of main method 
}// end of class BreadthFirstSearch

class Node
{
    int value;
    Node left;
    Node right;

    public Node(int value)
    {
        this.value = value;
        left = null;
        right = null;
    }// end of method Node 
}// end of class Node
```
## 12. MATH CLASS

<img src="https://media.giphy.com/media/gEvab1ilmJjA82FaSV/giphy-downsized.gif">

The java.lang.Math class contains a variety of mathematical functions and constants. Some of the most commonly used methods include:

Function | Description
--------- | -----------
Math.abs(x) | Returns the absolute value of a given number.
Math.ceil(x) | Returns the smallest integer greater than or equal to a given number.
Math.floor(x) | Returns the largest integer less than or equal to a given number.
Math.max(x, y) | Returns the larger of two given numbers.
Math.min(x, y) | Returns the smaller of two given numbers.
Math.pow(x, y) | Returns x raised to the power of y.
Math.sqrt(x) | Returns the square root of a given number.
Math.random() | Returns a random number between 0 and 1.
Math.round(x) | Returns the closest integer to a given number.
Math.sin(x) | Returns the sine of a given angle in radians.
Math.cos(x) | Returns the cosine of a given angle in radians.
Math.tan(x) | Returns the tangent of a given angle in radians.
Math.asin(x) | Returns the arcsine of a given value in radians.
Math.acos(x) | Returns the arccosine of a given value in radians.
Math.atan(x) | Returns the arctangent of a given value in radians.
Math.log(x) | Returns the natural logarithm of a given number.
Math.log10(x) | Returns the base-10 logarithm of a given number.
Math.E | The base of the natural logarithms (approximately 2.718).
Math.PI | The ratio of the circumference of a circle to its diameter (approximately 3.14159).

All of these functions are static, which means that you can call them directly on the Math class, without needing to create an instance of the class.

### 12.1 Math Class Example

```java
class MathClassExample
{
    public static void main(String[] args)
    {

        // Using Math.abs()
        int number = -5;
        int absoluteValue = Math.abs(number);
        System.out.println("Absolute value of " + number + " is " + absoluteValue);
        
        // Using Math.ceil()
        double decimal = 4.3;
        double ceilValue = Math.ceil(decimal);
        System.out.println("Smallest integer greater than or equal to " + decimal + " is " + ceilValue);
        
        // Using Math.floor()
        decimal = 5.8;
        double floorValue = Math.floor(decimal);
        System.out.println("Largest integer less than or equal to " + decimal + " is " + floorValue);
        
        // Using Math.max()
        int x = 10;
        int y = 15;
        int maxValue = Math.max(x, y);
        System.out.println("Larger of " + x + " and " + y + " is " + maxValue);
        
        // Using Math.min()
        x = 20;
        y = 25;
        int minValue = Math.min(x, y);
        System.out.println("Smaller of " + x + " and " + y + " is " + minValue);
        
        // Using Math.pow()
        x = 2;
        y = 3;
        double powerValue = Math.pow(x, y);
        System.out.println(x + " raised to the power of " + y + " is " + powerValue);
    }// end of main method 
}// end of class MathClassExample
```
## 13. STRING CLASS

<img src="https://media.giphy.com/media/xT5LMLKAxV7XswLQsw/giphy.gif">

The String class in Java is a built-in class that represents a sequence of characters. It is one of the most widely used classes in Java, and it is used to represent text. Some of the key features of the String class include:

Immutable: Once a String object is created, its value cannot be changed. Any operation that modifies the value of a String will create a new String object.

Concatenation: The + operator can be used to concatenate two String objects. The concat() method can also be used to concatenate String objects.

Comparison: The equals() method can be used to compare the values of two String objects. The compareTo() method can be used to compare the lexicographic order of two String objects.

Searching: The indexOf() method can be used to find the index of a specific character or substring within a String. The lastIndexOf() method can be used to find the last occurrence of a specific character or substring within a String.

Substring: The substring() method can be used to extract a portion of a String.

Manipulation: The toLowerCase(), toUpperCase(), trim() method can be used to manipulate the string.

Split: The split() method can be used to split a String into an array of substrings based on a specified delimiter.

Formatting: The format() method can be used to format String in a specific way.

Regular expression: String class has matches() method that can be used to check if the string matches a specific regular expression.

These are some of the most common and useful methods of the String class. It also has many other methods that provide additional functionality.


Method | Description
--------- | -----------
char charAt(int index) | Returns the char value at the specified index
int compareTo(String anotherString) | Compares two strings lexicographically
int compareToIgnoreCase(String str) | Compares two strings lexicographically, ignoring case differences
String concat(String str) | Concatenates the specified string to the end of this string
boolean contains(CharSequence s) | Returns true if and only if this string contains the specified sequence of char values
static String copyValueOf(char[] data) | Equivalent to valueOf(char[])
static String copyValueOf(char[] data, int offset, int count) | Equivalent to valueOf(char[], int, int)
boolean endsWith(String suffix) | Tests if this string ends with the specified suffix
boolean equals(Object anObject) | Compares this string to the specified object
boolean equalsIgnoreCase(String anotherString) | Compares this String to another String, ignoring case considerations
void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) | Copies characters from this string into the destination character array
int indexOf(int ch) | Returns the index within this string of the first occurrence of the specified character
int indexOf(int ch, int fromIndex) | Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index
int indexOf(String str) | Returns the index within this string of the first occurrence of the specified substring
int indexOf(String str, int fromIndex) | Returns the index within this string of the first occurrence of the specified substring, starting at the specified index
boolean isEmpty() | Returns true if, and only if, length() is 0
int lastIndexOf(int ch) | Returns the index within this string of the last occurrence of the specified character
int lastIndexOf(int ch, int fromIndex) | Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index
int lastIndexOf(String str) | Returns the index within this string of the last occurrence of the specified substring
int lastIndexOf(String str, int fromIndex) | Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index
int length() | Returns the length of this string
String replace(char oldChar, char newChar) | Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
String replace(CharSequence target, CharSequence replacement) | Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence
String replaceAll(String regex, String replacement) | Replaces each substring of this string that matches the given regular expression with the given replacement
String replaceFirst(String regex, String replacement) | Replaces the first substring of this string that matches the given regular expression with the given replacement
String[] split(String regex) | Splits this string around matches of the given regular expression
String[] split(String regex, int limit) | Splits this string around matches of the given regular expression
boolean startsWith(String prefix) | Tests if this string starts with the specified prefix.
boolean startsWith(String prefix, int toffset) | Tests if the substring of this string beginning at the specified index starts with the specified prefix
CharSequence subSequence(int beginIndex, int endIndex) | Returns a character sequence that is a subsequence of this sequenc
String substring(int beginIndex) | Returns a string that is a substring of this string
char[] toCharArray() | Converts this string to a new character array
String toLowerCase() | Converts all of the characters in this String to lower case using the rules of the default locale
String toLowerCase(Locale locale) | Converts all of the characters in this String to lower case using the rules of the given Locale
String toUpperCase() | Converts all of the characters in this String to upper case using the rules of the default locale
String toUpperCase(Locale locale) | Converts all of the characters in this String to upper case using the rules of the given Locale
String trim() | Returns a string whose value is this string, with any leading and trailing whitespace removed

## 14. STRING BUFFER CLASS

<img src="https://media.giphy.com/media/uurtMtTKqkJda4dk8Y/giphy-downsized.gif">

StringBuffer is a class in Java that provides a mutable sequence of characters.

It is similar to the String class, but it can be modified after it is created. StringBuffer is thread-safe, meaning that multiple threads can access a single StringBuffer object without causing any problems.

Some common methods of the StringBuffer class include append, insert, and reverse. Additionally, StringBuffer has a capacity that can be increased if necessary to prevent reallocation of memory while concatenation.

| Method | Description |
| --- | --- |
| `append(Object obj)` | Appends the string representation of the Object argument. |
| `charAt(int index)` | Returns the char value in this sequence at the specified index. |
| `delete(int start,int end)` | Removes the characters in a substring of this sequence. |
| `deleteCharAt(int index)` | Removes the char at the specified position in this sequence. |
| `getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)` | Characters are copied from this sequence into the destination character array dst. |
| `equals(StringBuffer sb)` | Compares this object against the specified object. |
| `indexOf(String str)` | Returns the index within this string of the first occurrence of the specified substring. |
| `indexOf(String str,int fromIndex)` | Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. |
| `insert(int offset,String str)` | Inserts the string into this character sequence. |
| `lastIndexOf(String str,int fromIndex)` | Returns the index within this string of the last occurrence of the specified substring. |
| `length()` | Returns the length (character count). |
| `replace(int start,int end,String str)` | Replaces the characters in a substring of this sequence with characters in the specified String. |
| `reverse()` | Causes this character sequence to be replaced by the reverse of the sequence. |
| `setCharAt(int index,char ch)` | The character at the specified index is set to ch. |
| `subSequence(int start,int end)` | Returns a new character sequence that is a subsequence of this sequence. |
| `substring(int start,int end)` | Returns a new String that contains a subsequence of characters currently contained in this sequence. |
| `trimToSize()` | Attempts to reduce storage used for the character sequence. |

## 15. METHODS

<img src="https://media.giphy.com/media/lS0uY9t6lCi69FcWRA/giphy-downsized.gif">

In Java, methods are blocks of code that perform a specific task. They are used to encapsulate functionality and can be called multiple times within a program.

A method that has a return type of void, which means it does not return any value.

A method that has a return type and a method name, which means it returns a value of the specified type.

A method can be marked as static, which means it can be called without creating an instance of the class.

A method can take in parameters of different types and names, for example methodName(parameterType parameterName, parameterType parameterName)
A method can be marked as final, which means it cannot be overridden by subclasses.
A method can be marked as abstract, which means it has no implementation and must be implemented by subclasses.

It's worth noting that the return type can be any valid Java data type, including primitives, objects, and arrays. Also, the naming convention of methods are camelCase and the first letter is lowercase.

| Method | Description |
| --- | --- |
| `void returnType()` |  A method that has a return type of void, which means it does not return any value. |
| `returnType methodName()` | A method that has a return type and a method name, which means it returns a value of the specified type. |
| `static returnType methodName()` | A method that is marked as static, which means it can be called without creating an instance of the class. |
| `methodName(parameterType parameterName)` | A method that takes in a parameter of the specified type and name. |
| `methodName(parameterType parameterName, parameterType parameterName)` | A method that takes in multiple parameters of different types and names. |
| `final returnType methodName()` | A method that is marked as final, which means it cannot be overridden by subclasses. |
| `abstract returnType methodName()` | A method that is marked as abstract, which means it has no implementation and must be implemented by subclasses. |

```java
public class MethodExample
{
    public static void main(String[] args)
    {
        printMessage();
        int result = add(5, 10);
        System.out.println("Result of addition: " + result);
        double quotient = divide(20, 10);
        System.out.println("Result of division: " + quotient);
        int product = multiply(5, 10);
        System.out.println("Result of multiplication: " + product);
    }// end of main method 
    /**
    * method print message 
    * @param None
    * @return None
    */
    public static void printMessage()
    {
        System.out.println("Hello, this is a message from the print method.");
    }// end of method printMessage 
    /**
    * method add two numbers 
    * @param int a, int b
    * @return int
    */
    public static int add(int a, int b)
    {
        return a + b;
    }// end of method add
    /**
    * method divide two numbers 
    * @param double a, double b
    * @return double
    */
    public static double divide(double a, double b)
    {
        return a / b;
    }// end of method divide
    /**
    * method multiply two numbers 
    * @param int a, int b
    * @return int 
    */
    public static int multiply(int a, int b)
    {
        return a * b;
    }// end of method multiply
}// end of class MethodExample
```
## 16. RANDOM NUMBERS

In Java, there are several ways to generate random numbers.

The most commonly used method is through the use of the "Random" class, which is part of the Java standard library.

This class provides methods for generating various types of random numbers, such as integers, doubles, and booleans. Additionally, the class also provides methods for generating random numbers within a specified range.

![SuperRandomJohnnyWeissGIF](https://user-images.githubusercontent.com/91504420/213818160-5087f1ff-3a16-4d25-b450-589e1ce85d6d.gif)

```java
import java.util.Random;

public class RandomNumbers
{
    public static void main(String[] args)
    {
        // Creating an object of the Random class
        Random rand = new Random();
        
        // Generating a random integer between 0 and 9 (inclusive)
        int randomInt = rand.nextInt(10);
        System.out.println("Random Integer: " + randomInt);

        // Generating a random float between 0 and 1 (inclusive)
        float randomFloat = rand.nextFloat();
        System.out.println("Random Float: " + randomFloat);

        // Generating a random double between 0 and 1 (inclusive)
        double randomDouble = rand.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }// end of method main 
}// end of class RandomNumbers 
```

## 17. RECURSION

![CatsGIF](https://user-images.githubusercontent.com/91504420/213818272-6a195ca3-2252-4b7f-8255-02ba2a514ee4.gif)

Recursion in Java is a programming technique where a method calls itself in order to solve a problem. The method has a base case, which is a simple and straightforward problem that can be solved without recursion, and a recursive case, which breaks down the problem into simpler subproblems that can be solved using the same method.

In order for a recursive method to terminate, it must have a base case that is reached at some point. If the base case is not reached, the method will continue calling itself indefinitely, resulting in a stack overflow error.

A common example of recursion is the factorial function, which calculates the factorial of a given number. This can be computed using a loop, but it can also be computed using recursion.

Recursive methods can also be more efficient than their iterative counterparts, as they can take advantage of the computer's stack memory to store temporary data.

However, recursion can also consume more memory and processing power, so it's important to use it judiciously and be mindful of the problem's complexities.

It's also important to be mindful of the problem's complexities when using recursion and that some problems can be solved more efficiently with an iterative approach.

```java
public class Recursion 
{
    public static void main(String[] args)
    {
        // Call the recursive method
        int result = factorial(5);
        System.out.println("Factorial of 5: " + result);
    }// end of method main 

    // Recursive method to calculate the factorial of a given number
    public static int factorial(int n)
    {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1)
	{
            return 1;
        }
        // Recursive case: return n * factorial(n-1)
        else 
	{
            return n * factorial(n-1);
        }
    }// end of method factorial
}// end of class Recursion 
```
## 17. READ AND WRITE TO FILE

![INeedThoseFilesAssistantSpecialAgentInChargeJubalValentineGIF](https://user-images.githubusercontent.com/91504420/213818305-5e1e57df-ac01-446c-85ca-511c5c7d7b1a.gif)

Reading and writing to a file in Java can be done using the File and Scanner classes for reading, and the FileWriter and PrintWriter classes for writing.

To read a file, you can first create a File object that represents the file you want to read, and then create a Scanner object that reads the contents of the file. You can then use the nextLine() method of the Scanner class to read each line of the file.

To write a file, you can first create a FileWriter object that represents the file you want to write to, and then create a PrintWriter object that writes to the file. You can then use the println() method of the PrintWriter class to write to the file.

It's important to handle the exception when reading and writing to a file in case the file doesn't exist or there's a problem with the file path.

When reading and writing to a file, it's also important to close the file when you're finished. This can be done by calling the close() method on the Scanner, FileWriter, and PrintWriter objects.

It's also worth noting that java.nio package offers another set of classes to perform file reading and writing operations such as Files, Paths and BufferedReader which offer better performance and flexibility over the traditional IO package.

```java
import java.io.*;

public class WorkWithFile
{
    public static void main(String[] args)
    {
        // File to read from
        File file = new File("example.txt");
        // File to write to
        File outputFile = new File("output.txt");
        
        try 
	{
            // Reading from file
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) 
	    {
                System.out.println(line);
            }
            br.close();
            
            // Writing to file
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));
            writer.println("Writing to file example");
            writer.close();
            
        } 
	catch (IOException e
	{
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }// end of main method 
}// end of class WorkWithFile
```

## 19. LINKED LIST
A linked list is a data structure that consists of a sequence of elements, each containing a reference (or "link") to its next element. In Java, the LinkedList class is a commonly used implementation of a linked list.

One of the main advantages of a linked list over an array is that elements can be easily inserted or removed from the middle of the list. With an array, these operations would require shifting all of the elements after the insertion or removal point.

The LinkedList class in Java provides a variety of methods for working with the list, such as adding and removing elements, retrieving elements at specific positions, and searching for elements. It also implements the List interface, which means it has all the common methods that a list should have like add(), get(), remove(), size(), clear(), etc.

The LinkedList class uses a doubly-linked list implementation, which means that each element has a reference to both the next and the previous element in the list. This allows for efficient traversal in both directions.

It's worth noting that LinkedList is less efficient than an ArrayList when it comes to random access of elements (i.e. by index) since it needs to traverse the list from the head to the element's index.

It's also worth noting that linked lists require more memory than arrays, as each element requires a reference to the next element in addition to the element's value.

```java
import java.io.*; 
    
// Java program to implement 
// a Singly Linked List 
public class LinkedList 
{ 
    
    Node head; // head of list 
    
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node 
    { 
    
        int data; 
        Node next; 
    
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } // end of method Node
    } // end of class Node
    
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
          
    
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null)
	{ 
            list.head = new_node; 
        } 
        else
	{ 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null)
	    { 
                last = last.next; 
            } 
    
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
    
        // Return the list by head 
        return list; 
    } // end of method insert
    
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        // Traverse through the LinkedList 
        while (currNode != null)
	{ 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
     
            // Go to next node 
            currNode = currNode.next; 
        } 
    } // end of method printList
    
     // Method to delete a node in the LinkedList by KEY
    public static LinkedList deleteByKey(LinkedList list,int key)
    {
        // Store head node
        Node currNode = list.head, prev = null;
  

        if (currNode != null && currNode.data == key)
	{
            list.head = currNode.next; // Changed head
  
            // Display the message
            System.out.println(key + " found and deleted");
  
            // Return the updated List
            return list;
        }

        while (currNode != null && currNode.data != key)
	{
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }
  
        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null)
	{
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;
	    
            System.out.println(key + " found and deleted");
        }
  
        if (currNode == null)
	{
            // Display the message
            System.out.println(key + " not found");
        }
  
        // return the List
        return list;
    }// end of method deleteByKey
    
    // Method to delete a node in the LinkedList by POSITION
    public static LinkedList deleteAtPosition(LinkedList list, int index)
    {
        // Store head node
        Node currNode = list.head, prev = null;
  
        if (index == 0 && currNode != null)
	{
            list.head = currNode.next; // Changed head
  
            // Display the message
            System.out.println(
                index + " position element deleted");
  
            // Return the updated List
            return list;
        }
  
        while (currNode != null)
	{
  
            if (counter == index)
	    {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;
  
                // Display the message
                System.out.println(
                    index + " position element deleted");
                break;
            }
            else
	    {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
  
        // In this case, the currNode should be null
        if (currNode == null)
	{
            // Display the message
            System.out.println(index + " position element not found");
        }
  
        // return the List
        return list;
    }// end of method deleteAtPosition
    
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
    
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
    
        // Print the LinkedList 
        printList(list); 
    } // end of main method 
}// end of class LinkedList
```
