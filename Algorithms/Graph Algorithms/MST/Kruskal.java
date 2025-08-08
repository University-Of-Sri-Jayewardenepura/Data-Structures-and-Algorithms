package dsa.algorithms.graph;

import java.util.*;

public class Kruskal {
    public static class Edge implements Comparable<Edge>{ int u,v,w; Edge(int u,int v,int w){this.u=u;this.v=v;this.w=w;} public int compareTo(Edge o){return Integer.compare(w,o.w);} }
    static class DSU{ int[] p,r; DSU(int n){ p=new int[n]; r=new int[n]; for(int i=0;i<n;i++) p[i]=i; } int find(int x){ return p[x]==x?x:(p[x]=find(p[x])); } boolean union(int a,int b){ a=find(a); b=find(b); if(a==b) return false; if(r[a]<r[b]){int t=a;a=b;b=t;} p[b]=a; if(r[a]==r[b]) r[a]++; return true; } }
    public static List<Edge> mst(int n, List<Edge> edges){ Collections.sort(edges); DSU d=new DSU(n); List<Edge> res=new ArrayList<>(); for(Edge e: edges) if(d.union(e.u,e.v)) res.add(e); return res; }
    public static void main(String[] args){ List<Edge> es=Arrays.asList(new Edge(0,1,10), new Edge(0,2,6), new Edge(0,3,5), new Edge(1,3,15), new Edge(2,3,4)); List<Edge> mst=mst(4,new ArrayList<>(es)); int w= mst.stream().mapToInt(e->e.w).sum(); System.out.println("MST weight="+w); }
}

