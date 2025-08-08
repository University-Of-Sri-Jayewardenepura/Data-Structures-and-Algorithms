package dsa.algorithms.sorting.advanced;

import java.util.Arrays;

public class ShellSort {
    public static void sort(int[] a) {
        int n = a.length;
        int h = 1; while (h < n/3) h = 3*h + 1; // Knuth sequence
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                int v = a[i], j = i;
                while (j >= h && a[j - h] > v) { a[j] = a[j - h]; j -= h; }
                a[j] = v;
            }
            h = (h - 1) / 3;
        }
    }
    public static void main(String[] args){ int[] a={12,34,54,2,3}; sort(a); System.out.println(Arrays.toString(a)); }
}

