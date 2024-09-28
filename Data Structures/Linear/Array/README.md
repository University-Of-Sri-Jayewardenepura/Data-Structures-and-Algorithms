# Introduction to Arrays

Arrays are a fundamental data structure in computer programming. They provide an organized way to store collections of elements of the same data type, such as integers, floating-point numbers, or characters. Here's a breakdown of arrays based on the information from your sources:

### Key Characteristics of Arrays

*   **Fixed Size:** When you create an array, you define its length, which determines the maximum number of elements it can hold. This size remains fixed after the array is created.
*   **Sequential Storage:** Arrays store their elements in contiguous memory locations. This sequential storage is a key advantage for accessing elements quickly using their index.
*   **Index-Based Access:** Each element in an array is associated with a unique numerical index that represents its position within the array. The index typically starts at 0 for the first element, 1 for the second, and so on. You can directly access any element using its index.  For example, `arr` would give you the value stored in the fourth element of an array named `arr`.

### Common Array Operations

Your provided source code in "Data Structures and Algorithms Lecture 2.pptx.pdf" illustrates how to perform common operations on arrays in Java:

*   **Creating an Array:** In Java, you create an array by:

    1.  Declaring a variable with the array type:
        `int[] intArray; ` 
    2.  Allocating memory for the array using the `new` keyword and specifying the size:
        `intArray = new int;`

    You can also combine these steps: `int[] intArray = new int;`
*   **Initialization:** You can initialize array elements when you declare the array:

    `int[] intArray = { 10, 81, 34, 8, 95, 13, 19, 56, 75 };`

    Or, you can assign values to individual elements later:

    ```
    intArray = 10;
    intArray = 81;
    // ... and so on
    ```

   

*   **Displaying an Array:** You can display the contents of an array by iterating through it using a loop (like a `for` loop) and printing each element.

    ```java
    for(j=0; j<nElems; j++)   // display items
        System.out.print(arr[j] + "");
    System.out.println(""); 
    ```

   
*   **Searching an Array:** To find a specific value (a 'search key') in an array, you can iterate through the array and compare each element with the search key. This can be done using linear search.  If the search key is found, you can stop the iteration.
*   **Deleting an Element:** To delete an element, you first need to find it in the array. Then, shift all the elements to the right of the deleted element one position to the left to fill the gap. Finally, decrement the size of the array to reflect the deletion.
*   **Inserting an Element:** Inserting into an array requires checking if there's enough space and then shifting elements to make room for the new element. 

### Advantages of Using Arrays

*   **Direct Access:** Arrays allow you to access any element directly using its index, making retrievals very efficient. This is particularly useful when you know the position of the element you need.
*   **Simplicity:** Arrays are relatively simple to understand and use, making them a good choice for storing and manipulating collections of data, especially when the size is fixed.

### Disadvantages of Using Arrays

*   **Fixed Size:** The fixed size of arrays can be a limitation if you need a data structure that can grow or shrink dynamically.
*   **Insertion and Deletion:** Inserting or deleting elements in an array can be inefficient, especially if you need to maintain the order of elements, as it might require shifting other elements.

It's important to choose the right data structure based on the specific requirements of your program. While arrays are fundamental and often suitable, other data structures like linked lists, stacks, queues, and trees, as mentioned in your sources, can offer advantages in different scenarios.



## Java Code Examples for Array Operations

### [Full Code Example](./Array.java)

The following documentation outlines basic array operations in Java, such as displaying, searching, inserting, and deleting elements in an array. These operations are fundamental and demonstrate how to manipulate arrays using Java. While your original source files focus more on advanced topics like **recursive methods, binary trees, algorithm analysis, and linked lists**, here we cover basic array manipulation for a clearer understanding of array handling.

### 1. Displaying an Array

To display the contents of an array, you can use a `for` loop to iterate over each element and print it. Here's a sample code snippet that prints all the elements of an array:

```java
for (int j = 0; j < nElems; j++) {  // display items
  System.out.print(arr[j] + " ");
}
System.out.println("");
```

#### Explanation:
- The loop iterates through each element of the array `arr`.
- `nElems` represents the number of elements currently in the array.
- Each element (`arr[j]`) is printed followed by a space, and at the end, a newline (`System.out.println("")`) is added to move to the next line after the array is printed.

### 2. Searching for an Element in an Array

To search for an element within an array, the following example shows how to find a specific value (`searchKey`) and report whether the element is found:

```java
int searchKey = 66;  // The element we are searching for
int j;

for (j = 0; j < nElems; j++) {  // iterate over elements
  if (arr[j] == searchKey) {  // check if the current element matches the search key
    break;  // exit the loop if found
  }
}
if (j == nElems) {  // check if we reached the end without finding the element
  System.out.println("Can’t find " + searchKey);
} else {
  System.out.println("Found " + searchKey);
}
```

#### Explanation:
- We loop through the array using `j` as the index to compare each element to the `searchKey`.
- If the element is found, the loop breaks. If the loop completes without finding the key, it means the element is not in the array.

### 3. Inserting an Element into an Array

To insert a new element into an array, we need to ensure there's space available, and we may need to shift elements to make room for the new value. Here's how we do that:

```java
int newValue = 33;
if (nElems < arr.length) {  // Check if there's space in the array
  arr[nElems] = newValue;  // Insert the new element at the end
  nElems++;  // Increment the number of elements
} else {
  System.out.println("Array is full, cannot insert new element");
}
```

#### Explanation:
- The `if` condition checks whether there's space left in the array (`nElems < arr.length`).
- If space is available, the new element (`newValue`) is inserted at the end of the array, and `nElems` (the count of current elements) is incremented.

For inserting at a specific position, you need to shift existing elements:

```java
int newValue = 33;
int insertPos = 5;  // The position where we want to insert

if (nElems < arr.length && insertPos <= nElems) {  // Ensure valid insert
  for (int k = nElems; k > insertPos; k--) {  // Shift elements to the right
    arr[k] = arr[k - 1];
  }
  arr[insertPos] = newValue;  // Insert the new value
  nElems++;
} else {
  System.out.println("Cannot insert at this position.");
}
```

#### Explanation:
- The loop shifts elements to the right starting from the end of the array to make room for the new value at `insertPos`.
- The new value is then inserted, and the element count (`nElems`) is updated.

### 4. Deleting an Element from an Array

To delete an element from the array, we find the element, shift the remaining elements to the left to fill the gap, and update the element count:

```java
int searchKey = 55;  // The element to delete
int j;

for (j = 0; j < nElems; j++) {  // Search for the element to delete
  if (arr[j] == searchKey) {
    break;
  }
}
if (j == nElems) {  // Element not found
  System.out.println("Can’t find " + searchKey);
} else {  // Element found, shift the elements
  for (int k = j; k < nElems - 1; k++) {
    arr[k] = arr[k + 1];  // Shift elements to the left
  }
  nElems--;  // Decrease the count of elements
}
```

#### Explanation:
- First, the element to be deleted is searched for. If found, all the elements after it are shifted to the left to fill the gap.
- The total number of elements is decreased to reflect the deletion.


