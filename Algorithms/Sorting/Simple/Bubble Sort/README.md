# Bubble Sort

## Overview
Bubble sort is conceptually the simplest sorting algorithm but also very slow. It's rarely used in practice except for educational purposes.

## How It Works
1. Compare adjacent elements
2. Swap if they're in wrong order
3. Repeat passes through the array
4. Each pass "bubbles" the largest unsorted element to its correct position
5. Continue until no swaps are needed

## Characteristics
- **Time Complexity**: 
  - Best case: O(n) when array is already sorted
  - Average case: O(n²)
  - Worst case: O(n²)
- **Space Complexity**: O(1) - sorts in place
- **Stable**: Yes - maintains relative order of equal elements
- **Adaptive**: Yes - performs better on nearly sorted data

## Advantages
- Simple to understand and implement
- No additional memory needed
- Can detect if list is sorted early

## Disadvantages
- Very slow for large datasets
- Many unnecessary comparisons

## Implementation
- BubbleSort.java

