# Binary Search

## Overview
Binary search is performed on **ordered arrays**. It's much faster than linear search for large arrays by repeatedly dividing the search space in half.

## How It Works
1. Set lower bound (first index) and upper bound (last index)
2. Calculate middle index
3. Compare search key with middle element
4. If equal, element found
5. If key is less, search left half (adjust upper bound)
6. If key is greater, search right half (adjust lower bound)
7. Repeat until found or bounds cross

## Characteristics
- **Time Complexity**: O(log n) - halves search space each iteration
- **Space Complexity**: 
  - Iterative: O(1)
  - Recursive: O(log n) due to call stack
- **Prerequisite**: Array must be sorted
- **Much faster than linear search for large arrays**

## Recursive vs Iterative
- **Recursive**: Cleaner code, uses call stack, may cause stack overflow for very large arrays
- **Iterative**: More efficient space-wise, no stack overflow risk

## Implementation
- BinarySearch.java (both iterative and recursive versions)

