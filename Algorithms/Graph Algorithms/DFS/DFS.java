package dsa.algorithms.graph;

import java.util.*;

public class DFS {
    private final List<List<Integer>> adj;
    public DFS(int n){ adj = new ArrayList<>(n); for(int i=0;i<n;i++) adj.add(new ArrayList<>()); }
    public void addEdge(int u,int v){ adj.get(u).add(v); adj.get(v).add(u); }
    public List<Integer> traverse(int start){ boolean[] vis = new boolean[adj.size()]; List<Integer> order = new ArrayList<>(); dfs(start, vis, order); return order; }
    private void dfs(int u, boolean[] vis, List<Integer> order){ vis[u]=true; order.add(u); for(int v: adj.get(u)) if(!vis[v]) dfs(v,vis,order); }
    public static void main(String[] args){ DFS g=new DFS(5); g.addEdge(0,1); g.addEdge(0,2); g.addEdge(1,3); g.addEdge(1,4); System.out.println(g.traverse(0)); }
}

