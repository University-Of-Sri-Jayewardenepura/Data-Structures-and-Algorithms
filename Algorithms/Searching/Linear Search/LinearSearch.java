package dsa.algorithms.searching;

public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println(search(arr, 1)); // 3
        System.out.println(search(arr, 7)); // -1
    }
}

