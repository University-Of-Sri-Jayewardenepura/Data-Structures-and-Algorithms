package dsa.algorithms.greedy;

import java.util.*;

public class GreedyExamples {
    // Activity selection: intervals [start,end), select max non-overlapping
    public static List<int[]> activitySelection(int[][] intervals){ Arrays.sort(intervals, Comparator.comparingInt(a->a[1])); List<int[]> res=new ArrayList<>(); int end=-1_000_000_000; for(int[] iv: intervals){ if(iv[0] >= end){ res.add(iv); end=iv[1]; } } return res; }
    public static void main(String[] args){ int[][] acts={{1,4},{3,5},{0,6},{5,7},{3,9},{5,9},{6,10},{8,11},{8,12},{2,14},{12,16}}; System.out.println(activitySelection(acts).size()); }
}

