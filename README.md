# Java Visitor Pattern Exercises

This repository contains my solutions for a couple of university exam exercises focusing on the **Visitor Pattern** in Java. 

The goal of these exercises was to work with immutable binary trees and implement different visitors to traverse, modify, and search the trees without altering the original data structures.

## What's Inside

There are three main exercises here:

### 1. String-based Binary Trees (`src_with_string`)
An immutable binary tree where each node holds a `String`.
* **`ToUpperCase` Visitor**: Traverses the tree and returns a brand new tree with the exact same structure, but with all string labels converted to uppercase.
* **`Find` Visitor**: Traverses the tree and returns `true` if a specific target string exists anywhere in the tree.

### 2. Integer-based Binary Trees (`src_with_int`)
An immutable binary tree where each node holds an `int`.
* **`Increment` Visitor**: Returns a new tree where every integer label has been incremented by 1.
* **`LessThan` Visitor**: Returns `true` only if *all* the integer labels in the tree are strictly less than a given target value.

### 3. Boolean Formulas (`boolean_formulas`)
An immutable Abstract Syntax Tree (AST) representing boolean formulas.
* **`Eval` Visitor**: Traverses the formula tree and evaluates it recursively according to standard boolean logic (handling boolean literals, logical NOT, and logical implication).

### 4. Recursive Lists (`list_exp`)
An implementation of a recursive list structure using the Visitor pattern to perform operations on the list.
* **`Length` Visitor**: Calculates the length of the recursive list by traversing the `ListCons` and `EmptyList` nodes.

## How to run
Compile and run the tests for each exercise directly from the terminal at the root of the project (`Visitor_Pattern_Java`).

For the String trees:
```bash
javac src_with_string/*.java
java -ea src_with_string.Main
```

For the Integer trees:
```bash
javac src_with_int/*.java
java -ea src_with_int.Main
```

For the Boolean Formulas:
```bash
javac boolean_formulas/*.java
java -ea boolean_formulas.Main
```

For the Recursive Lists:
```bash
javac list_exp/*.java
java -ea list_exp.Main
```

*(The `-ea` flag is used to enable assertions so the tests run correctly).*