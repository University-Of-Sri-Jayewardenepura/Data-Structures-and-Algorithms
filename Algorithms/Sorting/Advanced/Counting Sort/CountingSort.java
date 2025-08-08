package dsa.algorithms.sorting.advanced;

import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] a, int maxValue) {
        int[] count = new int[maxValue + 1];
        for (int v : a) count[v]++;
        int idx = 0;
        for (int v = 0; v <= maxValue; v++) {
            while (count[v]-- > 0) a[idx++] = v;
        }
    }
    public static void main(String[] args){ int[] a={4,2,2,8,3,3,1}; sort(a, 8); System.out.println(Arrays.toString(a)); }
}

