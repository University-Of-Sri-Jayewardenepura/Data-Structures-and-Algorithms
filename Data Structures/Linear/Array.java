public class Array {

    public static void main(String[] args) {
        // Initialize an array with a fixed size and some elements
        int[] arr = new int[10];
        int nElems = 5;  // current number of elements in the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Display the array
        System.out.println("Initial Array:");
        displayArray(arr, nElems);

        // Search for an element
        int searchKey = 30;
        System.out.println("\nSearching for element " + searchKey + ":");
        searchArray(arr, nElems, searchKey);

        // Insert a new element
        int newValue = 60;
        System.out.println("\nInserting element " + newValue + ":");
        nElems = insertElement(arr, nElems, newValue);
        displayArray(arr, nElems);

        // Insert element at a specific position
        int insertPos = 2;  // insert at position 2 (third element)
        newValue = 25;
        System.out.println("\nInserting element " + newValue + " at position " + insertPos + ":");
        nElems = insertElementAtPosition(arr, nElems, newValue, insertPos);
        displayArray(arr, nElems);

        // Delete an element
        int deleteKey = 40;
        System.out.println("\nDeleting element " + deleteKey + ":");
        nElems = deleteElement(arr, nElems, deleteKey);
        displayArray(arr, nElems);
    }

    // Method to display the array
    public static void displayArray(int[] arr, int nElems) {
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    // Method to search for an element in the array
    public static void searchArray(int[] arr, int nElems, int searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                System.out.println("Found element " + searchKey + " at index " + j);
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Element " + searchKey + " not found.");
        }
    }

    // Method to insert an element at the end of the array
    public static int insertElement(int[] arr, int nElems, int newValue) {
        if (nElems < arr.length) {
            arr[nElems] = newValue;
            nElems++;
        } else {
            System.out.println("Array is full, cannot insert new element.");
        }
        return nElems;
    }

    // Method to insert an element at a specific position
    public static int insertElementAtPosition(int[] arr, int nElems, int newValue, int pos) {
        if (nElems < arr.length && pos <= nElems) {
            for (int k = nElems; k > pos; k--) {
                arr[k] = arr[k - 1];
            }
            arr[pos] = newValue;
            nElems++;
        } else {
            System.out.println("Cannot insert at this position.");
        }
        return nElems;
    }

    // Method to delete an element from the array
    public static int deleteElement(int[] arr, int nElems, int searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Element " + searchKey + " not found.");
            return nElems;
        } else {
            for (int k = j; k < nElems - 1; k++) {
                arr[k] = arr[k + 1];
            }
            nElems--;
            return nElems;
        }
    }
}
