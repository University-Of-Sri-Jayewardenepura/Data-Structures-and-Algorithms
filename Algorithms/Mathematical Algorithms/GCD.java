package dsa.algorithms.math;

public class GCD {
    public static int gcd(int a, int b){ while(b!=0){ int t=a%b; a=b; b=t; } return Math.abs(a); }
    public static void main(String[] args){ System.out.println(gcd(48,18)); }
}

