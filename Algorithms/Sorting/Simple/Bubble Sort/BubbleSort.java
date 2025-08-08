package dsa.algorithms.sorting.simple;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] a) {
        boolean swapped;
        for (int n = a.length; n > 1; n--) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (a[i-1] > a[i]) { int t = a[i-1]; a[i-1] = a[i]; a[i] = t; swapped = true; }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args){ int[] a={5,1,4,2,8}; sort(a); System.out.println(Arrays.toString(a)); }
}

