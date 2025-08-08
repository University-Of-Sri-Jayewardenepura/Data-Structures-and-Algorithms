package dsa.algorithms.backtracking;

import java.util.*;

public class NQueens {
    public static List<int[]> solve(int n){ List<int[]> res=new ArrayList<>(); int[] cols=new int[n]; Arrays.fill(cols,-1); boolean[] col=new boolean[n], d1=new boolean[2*n], d2=new boolean[2*n]; backtrack(0,n,cols,col,d1,d2,res); return res; }
    private static void backtrack(int r,int n,int[] cols,boolean[] col,boolean[] d1,boolean[] d2,List<int[]> res){ if(r==n){ res.add(cols.clone()); return; } for(int c=0;c<n;c++){ int id1=r-c+n, id2=r+c; if(col[c]||d1[id1]||d2[id2]) continue; col[c]=d1[id1]=d2[id2]=true; cols[r]=c; backtrack(r+1,n,cols,col,d1,d2,res); col[c]=d1[id1]=d2[id2]=false; cols[r]=-1; } }
    public static void main(String[] args){ System.out.println(solve(8).size()); }
}

