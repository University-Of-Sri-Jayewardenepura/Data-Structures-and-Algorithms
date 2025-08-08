package dsa.algorithms.bnb;

import java.util.*;

public class KnapsackBranchAndBound {
    static class Item{ int w,v; double ratio; Item(int w,int v){this.w=w;this.v=v; this.ratio=v/(double)w;} }
    static class Node{ int level, profit, weight; double bound; Node(int l,int p,int w){level=l;profit=p;weight=w;} }
    public static int solve(int W, int[] wt, int[] val){ int n=wt.length; Item[] items=new Item[n]; for(int i=0;i<n;i++) items[i]=new Item(wt[i],val[i]); Arrays.sort(items, (a,b)->Double.compare(b.ratio,a.ratio)); PriorityQueue<Node> pq=new PriorityQueue<>(Comparator.comparingDouble((Node x)->-x.bound)); Node u=new Node(-1,0,0); u.bound=bound(u,W,items); pq.add(u); int max=0; while(!pq.isEmpty()){ Node x=pq.poll(); if(x.bound<=max || x.level==n-1) continue; Node with=new Node(x.level+1, x.profit+items[x.level+1].v, x.weight+items[x.level+1].w); if(with.weight<=W && with.profit>max) max=with.profit; with.bound=bound(with,W,items); if(with.bound>max) pq.add(with); Node without=new Node(x.level+1, x.profit, x.weight); without.bound=bound(without,W,items); if(without.bound>max) pq.add(without); }
        return max; }
    private static double bound(Node u,int W, Item[] items){ if(u.weight>W) return 0; double profit=u.profit; int w=u.weight; int i=u.level+1; while(i<items.length && w+items[i].w<=W){ w+=items[i].w; profit+=items[i].v; i++; } if(i<items.length){ profit += (W - w) * items[i].ratio; } return profit; }
    public static void main(String[] args){ int[] wt={10,20,30}; int[] val={60,100,120}; System.out.println(solve(50,wt,val)); }
}

