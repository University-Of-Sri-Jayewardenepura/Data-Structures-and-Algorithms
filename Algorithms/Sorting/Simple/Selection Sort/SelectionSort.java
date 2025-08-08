package dsa.algorithms.sorting.simple;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) if (a[j] < a[min]) min = j;
            if (min != i) { int t = a[i]; a[i] = a[min]; a[min] = t; }
        }
    }
    public static void main(String[] args){ int[] a={64,25,12,22,11}; sort(a); System.out.println(Arrays.toString(a)); }
}

