package dsa.algorithms.geometry;

import java.util.*;

public class ConvexHullJarvis {
    static class Point { int x,y; Point(int x,int y){this.x=x;this.y=y;} @Override public String toString(){return "("+x+","+y+")";} }
    public static List<Point> hull(List<Point> pts){ if(pts.size()<3) return new ArrayList<>(pts); int l=0; for(int i=1;i<pts.size();i++) if(pts.get(i).x < pts.get(l).x) l=i; List<Point> hull=new ArrayList<>(); int p=l,q; do{ hull.add(pts.get(p)); q=(p+1)%pts.size(); for(int i=0;i<pts.size();i++) if(orientation(pts.get(p), pts.get(i), pts.get(q))==2) q=i; p=q; } while(p!=l); return hull; }
    // 0 colinear, 1 clockwise, 2 counterclockwise
    private static int orientation(Point a, Point b, Point c){ long v=(long)(b.y-a.y)*(c.x-b.x)-(long)(b.x-a.x)*(c.y-b.y); if(v==0) return 0; return v>0?1:2; }
    public static void main(String[] args){ List<Point> pts=Arrays.asList(new Point(0,3),new Point(2,2),new Point(1,1),new Point(2,1),new Point(3,0),new Point(0,0),new Point(3,3)); System.out.println(hull(pts)); }
}

