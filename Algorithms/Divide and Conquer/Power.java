package dsa.algorithms.divideconquer;

public class Power {
    public static long pow(long a, long n){ if(n==0) return 1; long half = pow(a, n/2); long ans = half*half; return (n%2==0)? ans : ans*a; }
    public static void main(String[] args){ System.out.println(pow(2, 50)); }
}

