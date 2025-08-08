# Recursion

## Overview
Recursion is when a method calls itself to solve a problem by breaking it into smaller versions of the same problem. It's fundamental to many algorithms and is the basis of divide-and-conquer strategies.

## Why Use Recursion?
- Sometimes the best way to solve a problem is by solving a smaller version first
- Some functional languages (Haskell, Scheme, Erlang) rely entirely on recursion
- Natural for problems with recursive structure (trees, fractals)
- Often leads to cleaner, more elegant code

## General Recursive Design Strategy
1. **Identify base case(s)**: Inputs that produce results without recurring
2. **Determine general case(s)**: Express problem as smaller version of itself
3. **Devise solution combining strategy**: How to combine results

## Classic Examples

### Factorial
- Formula: n! = n × (n-1)! for n > 0
- Base case: 0! = 1 or 1! = 1
- Recursive case: factorial(n) = n × factorial(n-1)

### Triangular Numbers
- Counts objects in equilateral triangle arrangement
- Sequence: 0, 1, 3, 6, 10, 15, 21, 28, 36, 45...
- Formula: Triangle(n) = Triangle(n-1) + n
- Base case: Triangle(1) = 1

### Fibonacci Numbers
- Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
- Each number is sum of two preceding ones
- Formula: Fn = Fn-1 + Fn-2
- Base cases: F0 = 0, F1 = 1

### Towers of Hanoi
- Ancient puzzle with disks on three pegs
- Move all disks from peg A to peg C
- Rules:
  - Only one disk at a time
  - No larger disk on smaller disk
- Recursive solution moves n-1 disks, then largest, then n-1 again
- Time complexity: O(2ⁿ)

### Anagrams
- All permutations of letters in a word
- Example: "cat" yields: cat, cta, atc, act, tca, tac
- Number of anagrams = n! where n is number of letters

## Recursion vs Iteration
- Any recursive solution can be converted to iterative
- Recursion uses call stack (may cause stack overflow)
- Iteration often more efficient but less intuitive for some problems

## Implementation
- RecursionExamples.java (factorial, triangular, fibonacci, hanoi)

