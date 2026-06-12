# Java Visitor Pattern Exercises

This repository contains my solutions for a couple of university exam exercises focusing on the **Visitor Pattern** in Java. 

The goal of these exercises was to work with immutable binary trees and implement different visitors to traverse, modify, and search the trees without altering the original data structures.

## What's Inside

There are two main exercises here:

### 1. String-based Binary Trees (`src_with_string`)
An immutable binary tree where each node holds a `String`.
* **`ToUpperCase` Visitor**: Traverses the tree and returns a brand new tree with the exact same structure, but with all string labels converted to uppercase.
* **`Find` Visitor**: Traverses the tree and returns `true` if a specific target string exists anywhere in the tree.

### 2. Integer-based Binary Trees (`src_with_int`)
An immutable binary tree where each node holds an `int`.
* **`Increment` Visitor**: Returns a new tree where every integer label has been incremented by 1.
* **`LessThan` Visitor**: Returns `true` only if *all* the integer labels in the tree are strictly less than a given target value.

## How to run
You can compile and run the tests for each exercise directly from the terminal. 

For the String trees:
```bash
cd src_with_string
javac *.java
java -ea Main
```

For the Integer trees:
```bash
cd src_with_int
javac *.java
java -ea Main
```
*(The `-ea` flag is used to enable assertions so the tests run correctly).*