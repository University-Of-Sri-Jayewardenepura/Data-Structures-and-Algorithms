package dsa.algorithms.sorting.advanced;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    public static void sort(int[] a) {
        shuffle(a); // mitigate worst-case
        sort(a, 0, a.length - 1);
    }
    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int p = partition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p + 1, hi);
    }
    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (a[j] <= pivot) { int t = a[i]; a[i] = a[j]; a[j] = t; i++; }
        }
        int t = a[i]; a[i] = a[hi]; a[hi] = t;
        return i;
    }
    private static void shuffle(int[] a){
        ThreadLocalRandom r = ThreadLocalRandom.current();
        for (int i = a.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int t = a[i]; a[i] = a[j]; a[j] = t;
        }
    }
    public static void main(String[] args){ int[] a={10,7,8,9,1,5}; sort(a); System.out.println(Arrays.toString(a)); }
}

