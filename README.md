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

