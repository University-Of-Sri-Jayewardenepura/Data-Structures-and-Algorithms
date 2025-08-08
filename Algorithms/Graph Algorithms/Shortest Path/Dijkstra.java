package dsa.algorithms.graph;

import java.util.*;

public class Dijkstra {
    public static int[] shortestPath(int n, List<List<int[]>> adj, int src){
        int[] dist = new int[n]; Arrays.fill(dist, Integer.MAX_VALUE); dist[src]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.add(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] cur = pq.poll(); int u = cur[0], d = cur[1]; if (d != dist[u]) continue;
            for (int[] e : adj.get(u)) { int v=e[0], w=e[1]; if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){ dist[v]=dist[u]+w; pq.add(new int[]{v, dist[v]}); } }
        }
        return dist;
    }
    public static void main(String[] args){ int n=5; List<List<int[]>> adj=new ArrayList<>(); for(int i=0;i<n;i++) adj.add(new ArrayList<>()); adj.get(0).add(new int[]{1,10}); adj.get(0).add(new int[]{2,3}); adj.get(2).add(new int[]{1,1}); adj.get(1).add(new int[]{3,2}); adj.get(2).add(new int[]{3,8}); int[] d=shortestPath(n,adj,0); System.out.println(Arrays.toString(d)); }
}

