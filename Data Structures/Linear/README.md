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


