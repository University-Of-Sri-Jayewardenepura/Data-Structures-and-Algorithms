## Introduction to Stacks

Stacks are a type of data structure used primarily as a tool in programming, often for managing specific tasks related to memory management, expression evaluation, and more. Unlike other data structures like arrays, linked lists, or trees, which represent real-world entities, stacks operate abstractly and follow a strict Last-In-First-Out (LIFO) order. This means the last element added is the first one that can be removed. Stacks are typically used in scenarios where the order of operations matters, such as in function calls or parsing.

### Stack Operations

A stack supports the following core operations:

1. **Push**: Adds a new element to the top of the stack.
2. **Pop**: Removes and returns the element from the top of the stack.
3. **Peek/Top**: Returns the element at the top of the stack without removing it.
4. **isEmpty**: Checks if the stack is empty.
5. **Size**: Returns the number of elements in the stack.

These operations allow efficient management of data in a stack-like fashion, with elements being added and removed from the top of the stack only.

### Stack Use Cases

Stacks are often employed in several common scenarios in programming:

- **Delimiter Matching**: Verifying that symbols like parentheses, braces, or brackets are properly balanced in code or expressions.
- **Expression Evaluation**: Evaluating postfix or prefix arithmetic expressions where the LIFO principle is used to simplify the process.
- **Backtracking**: Undoing operations (like in undo functionality in editors).
- **Recursion Management**: Stacks are implicitly used in function call management by languages that support recursion.
- **Reversing Data**: Using a stack to reverse the order of elements like words, lists, or strings.

### Stack Implementation in Java

### [Full Code Example](./Stack.java)

Here's a breakdown of each stack operation implemented in Java, along with the corresponding code snippets for each part.

### 1. **Push Operation**

The `push` method adds an element to the top of the stack. It first checks if the stack is full, then inserts the element at the top and increments the top index.

```java
// Push operation
public void push(int value) {
    if (top == maxSize - 1) {
        System.out.println("Stack is full");
    } else {
        stackArray[++top] = value;  // Add element and increment top
    }
}
```

### 2. **Pop Operation**

The `pop` method removes and returns the top element from the stack. It first checks if the stack is empty, then removes the top element and decrements the top index.

```java
// Pop operation
public int pop() {
    if (top == -1) {
        System.out.println("Stack is empty");
        return -1;  // Return -1 if stack is empty
    } else {
        return stackArray[top--];  // Return element and decrement top
    }
}
```

### 3. **Peek/Top Operation**

The `peek` method returns the top element of the stack without removing it. It checks if the stack is empty and returns the top element.

```java
// Peek operation
public int peek() {
    if (top == -1) {
        System.out.println("Stack is empty");
        return -1;  // Return -1 if stack is empty
    } else {
        return stackArray[top];  // Return top element
    }
}
```

### 4. **isEmpty Operation**

The `isEmpty` method checks whether the stack is empty. It returns `true` if the stack has no elements.

```java
// isEmpty operation
public boolean isEmpty() {
    return (top == -1);  // True if stack is empty
}
```

### 5. **Size Operation**

The `size` method returns the current number of elements in the stack. It calculates this by returning the value of `top + 1`.

```java
// Size operation
public int size() {
    return top + 1;  // Size is top index + 1
}
```

### Efficiency and Comparison with Other Data Structures

The efficiency of stack operations depends on the underlying implementation. When implemented using an array, the stack has:

- **Push**: O(1) – Constant time for adding an element (if the stack isn't full).
- **Pop**: O(1) – Constant time for removing an element.
- **Peek**: O(1) – Constant time for viewing the top element.
- **Space Complexity**: O(n) – Linear space for storing `n` elements.

However, stacks can also be implemented using linked lists, which may offer more flexibility at the cost of slightly increased overhead due to dynamic memory allocation.

#### Comparison with Other Data Structures:

1. **Arrays**: Arrays allow random access to elements in O(1) time, but resizing and insertion/removal (other than from the end) can be costly, O(n). Stacks restrict operations to the top, leading to more predictable performance.

2. **Queues**: A queue follows a First-In-First-Out (FIFO) principle, which is opposite to the stack's LIFO behavior. Operations like enqueue and dequeue in queues have O(1) complexity when implemented with linked lists or circular arrays.

3. **Linked Lists**: Linked lists provide flexibility in terms of dynamic sizing and efficient insertion/removal from both ends. However, accessing elements in a linked list takes O(n) time due to the need to traverse the list.

4. **Trees**: Trees, like binary search trees, allow hierarchical data organization with O(log n) insertion, deletion, and lookup times (for balanced trees), making them more suited for search-heavy applications compared to stacks.

5. **Hash Tables**: Hash tables provide O(1) average time complexity for insertions, deletions, and lookups, but are more complex in terms of collision handling and aren't ordered like stacks.

### Big-O Notation Summary for Stack Operations

| Operation | Array (Stack) | Linked List (Stack) | Time Complexity |
| --------- | ------------- | ------------------- | --------------- |
| Push      | O(1)          | O(1)                | O(1)            |
| Pop       | O(1)          | O(1)                | O(1)            |
| Peek      | O(1)          | O(1)                | O(1)            |
| isEmpty   | O(1)          | O(1)                | O(1)            |
| Size      | O(1)          | O(n)                | O(n) (for linked list) |

