# Algorithm Lab

A personal collection of LeetCode and algorithm problem solutions, written in Java.

Each problem lives in its own package under `org.example.leetcode`, with the solution class(es) and, where useful, alternate approaches for comparison (brute force vs. optimized, different data structures, etc.).

## Requirements

- Java 25 (JDK)
- Maven

## Project Structure

```
src/main/java/org/example/
├── Main.java
└── leetcode/
    └── <problem-name>/
        └── <ProblemName>.java
```

Each problem gets its own package, named in lowercase (e.g. `validparentheses`), containing a class named after the problem (e.g. `ValidParentheses`).

## Solved Problems

| # | Problem | Package | Notes |
|---|---------|---------|-------|
| 1 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | `leetcode.validparentheses` | Stack-based and `List`-based approaches |
| 2 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | `leetcode.mergesortedarray` | In-place merge from the back, three-pointer approach |

## Building & Running

Build the project:

```bash
mvn compile
```

Run a specific solution's `main` method from your IDE, or via Maven:

```bash
mvn exec:java -Dexec.mainClass="org.example.leetcode.validparentheses.ValidParentheses"
```

## Conventions

- One package per problem, named after the problem in lowercase with no separators.
- The main solution method matches the method signature expected by LeetCode (e.g. `isValid(String s)`).
- Alternative implementations of the same problem are kept as additional methods (e.g. `isValid2`) or classes within the same package, rather than overwriting earlier attempts, so different approaches stay easy to compare.

## Goal

This repo is a practice space for improving problem-solving and algorithmic thinking — not production code. Expect solutions of varying polish, occasional brute-force-first passes, and notes-to-self left inline.
