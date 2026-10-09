# Loops Homework — Prime Number Checker

## Overview

In this assignment, you will create a Java program that determines whether a number is a prime number.

You will practice:

- `for` loops
- `if` / `else`
- Boolean variables
- Modulus (`%`)
- User input
- `Scanner`

---

## Learning Objectives

By completing this assignment, you should be able to:

1. Use a `for` loop to examine a range of values.
2. Use the modulus operator to determine whether a number is divisible by another number.
3. Use a Boolean variable to track a result.
4. Use conditional statements inside a loop.
5. Read an integer from the user.
6. Determine whether a number is prime.

---

## Problem Description

Create a Java program named:

```text
PrimeChecker.java
```

The program should ask the user to enter a positive integer and determine whether the number is prime.

A **prime number** is a positive integer greater than `1` that has exactly two factors:

- `1`
- The number itself

For example, `7` is prime because it is divisible only by `1` and `7`.

However, `12` is not prime because it is divisible by:

```text
1, 2, 3, 4, 6, 12
```

---

## Requirements

### 1. Class Name

Your Java file must be named:

```text
PrimeChecker.java
```

The class must be named:

```java
PrimeChecker
```

### 2. Main Method

Your program must contain:

```java
public static void main(String[] args)
```

### 3. Import Scanner

Your program must use `Scanner` to read input.

Include:

```java
import java.util.Scanner;
```

Create a `Scanner` object connected to standard input.

### 4. Number Variable

Create an `int` variable named:

```text
number
```

Use the `Scanner` to allow the user to enter the number.

### 5. Prime Variable

Create a Boolean variable named:

```text
isPrime
```

Initialize it to:

```java
boolean isPrime = true;
```

Use this variable to keep track of whether the number is prime.

---

## 6. Handle Numbers Less Than 2

A prime number must be greater than `1`.

If the user enters a number less than `2`, the program must determine that the number is **not prime**.

For example:

```text
0 → Not prime
1 → Not prime
```

---

## 7. Use a For Loop

Use a `for` loop to test whether the number is divisible by another number.

The loop should test possible divisors beginning at `2` and continuing while the divisor is less than the number.

For example:

```java
for (int i = 2; i < number; i++) {
    // determine whether number is divisible by i
}
```

You must determine the appropriate condition for identifying a divisor.

---

## 8. Use the Modulus Operator

Use the modulus operator `%` to determine whether the number is evenly divisible.

For example:

```java
number % i == 0
```

If this condition is true, `i` is a divisor of `number`.

If a divisor other than `1` and the number itself is found, the number is not prime.

---

## 9. Display the Result

If the number is prime, display:

```text
Prime: true
```

If the number is not prime, display:

```text
Prime: false
```

---

## Required Output

For an input of:

```text
7
```

your program must produce output similar to:

```text
Enter a positive integer: 7
Prime: true
```

---

## Example Program Runs

### Example 1 — Prime Number

```text
Enter a positive integer: 7
Prime: true
```

### Example 2 — Non-Prime Number

```text
Enter a positive integer: 12
Prime: false
```


---

## Prime-Checking Logic

Your program should follow this general process:

```text
1. Read the number.
2. Assume the number is prime.
3. If the number is less than 2, it is not prime.
4. Otherwise, use a loop to test possible divisors.
5. If a divisor is found, mark the number as not prime.
6. Display the result.
```


---

## Stopping the Loop

Once you determine that a number is not prime, there is no need to continue checking additional divisors.

You may use:

```java
break;
```

to exit the loop after a divisor is found.

Using `break` is optional.

---

## Restrictions

For this assignment:

- Do not use arrays.
- Do not use `ArrayList`.
- Do not use `while` loops.
- Do not use `do-while` loops.
- Do not use `switch`.
- Do not create additional classes.
- Do not use external libraries.
- You must use `Scanner`.
- You must use a `for` loop.
- You must correctly handle numbers less than `2`.
- Do not hard-code the result.
- Do not use recursion.

The purpose of this assignment is to practice loops, conditional statements, Boolean variables, and the modulus operator.

---

## Input Assumption

You may assume that the user enters a valid integer.

You do not need to implement input validation for non-numeric input.

You must correctly handle the values `0` and `1`.

---

## How to Compile

Open a terminal in the directory containing `PrimeChecker.java`.

Compile the program:

```bash
javac PrimeChecker.java
```

---

## How to Run

Run the program using:

```bash
java PrimeChecker
```

---

## Submission

Your repository should contain:

```text
PrimeChecker.java
```

Commit and push your work to your GitHub Classroom repository.

---

## Before You Submit

Make sure that:

- [ ] The file is named exactly `PrimeChecker.java`.
- [ ] The class is named exactly `PrimeChecker`.
- [ ] The program contains the required `main` method.
- [ ] `java.util.Scanner` is imported.
- [ ] A `Scanner` object is created.
- [ ] The user is prompted to enter a number.
- [ ] A `for` loop is used to test possible divisors.
- [ ] Numbers less than `2` are identified as not prime.
- [ ] A number with a divisor other than `1` and itself is identified as not prime.
- [ ] Prime numbers are correctly identified.
- [ ] The final result uses the `isPrime` variable.
- [ ] The program does not use arrays.
- [ ] The program compiles without errors.
- [ ] The program produces the correct result.

## Submission Reminder

Do not modify the required file name or class name.

