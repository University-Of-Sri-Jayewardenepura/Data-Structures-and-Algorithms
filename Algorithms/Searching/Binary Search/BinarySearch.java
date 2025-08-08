package dsa.algorithms.searching;

public class BinarySearch {
    public static int iterative(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static int recursive(int[] arr, int key) {
        return rec(arr, 0, arr.length - 1, key);
    }

    private static int rec(int[] arr, int lo, int hi, int key) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == key) return mid;
        if (arr[mid] < key) return rec(arr, mid + 1, hi, key);
        else return rec(arr, lo, mid - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(iterative(arr, 6)); // 5
        System.out.println(recursive(arr, 10)); // -1
    }
}

