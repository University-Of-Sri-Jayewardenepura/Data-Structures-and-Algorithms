package dsa.algorithms.sorting.advanced;

import java.util.Arrays;

public class RadixSort {
    public static void sort(int[] a) {
        int max = 0; for (int v : a) if (v > max) max = v;
        for (int exp = 1; max / exp > 0; exp *= 10) countSortByDigit(a, exp);
    }
    private static void countSortByDigit(int[] a, int exp) {
        int n = a.length;
        int[] out = new int[n];
        int[] count = new int[10];
        for (int v : a) count[(v / exp) % 10]++;
        for (int i = 1; i < 10; i++) count[i] += count[i-1];
        for (int i = n - 1; i >= 0; i--) {
            int d = (a[i] / exp) % 10;
            out[--count[d]] = a[i];
        }
        System.arraycopy(out, 0, a, 0, n);
    }
    public static void main(String[] args){ int[] a={170,45,75,90,802,24,2,66}; sort(a); System.out.println(Arrays.toString(a)); }
}

