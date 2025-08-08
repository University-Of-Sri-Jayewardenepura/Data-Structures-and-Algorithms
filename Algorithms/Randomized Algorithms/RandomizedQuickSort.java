package dsa.algorithms.randomized;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class RandomizedQuickSort {
    public static void sort(int[] a){ rqsort(a,0,a.length-1); }
    private static void rqsort(int[] a,int lo,int hi){ if(lo>=hi) return; int p=randPartition(a,lo,hi); rqsort(a,lo,p-1); rqsort(a,p+1,hi); }
    private static int randPartition(int[] a,int lo,int hi){ int i=ThreadLocalRandom.current().nextInt(lo,hi+1); int t=a[i]; a[i]=a[hi]; a[hi]=t; int pivot=a[hi]; int s=lo; for(int j=lo;j<hi;j++) if(a[j]<=pivot){ t=a[s]; a[s]=a[j]; a[j]=t; s++; } t=a[s]; a[s]=a[hi]; a[hi]=t; return s; }
    public static void main(String[] args){ int[] a={3,6,8,10,1,2,1}; sort(a); System.out.println(Arrays.toString(a)); }
}

