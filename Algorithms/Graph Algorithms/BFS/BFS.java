package dsa.algorithms.graph;

import java.util.*;

public class BFS {
    private final List<List<Integer>> adj;
    public BFS(int n){ adj = new ArrayList<>(n); for(int i=0;i<n;i++) adj.add(new ArrayList<>()); }
    public void addEdge(int u,int v){ adj.get(u).add(v); adj.get(v).add(u); }
    public List<Integer> traverse(int start){ boolean[] vis = new boolean[adj.size()]; Queue<Integer> q = new ArrayDeque<>(); List<Integer> order = new ArrayList<>(); vis[start]=true; q.add(start); while(!q.isEmpty()){ int u=q.remove(); order.add(u); for(int v: adj.get(u)) if(!vis[v]){ vis[v]=true; q.add(v);} } return order; }
    public static void main(String[] args){ BFS g=new BFS(5); g.addEdge(0,1); g.addEdge(0,2); g.addEdge(1,3); g.addEdge(1,4); System.out.println(g.traverse(0)); }
}

