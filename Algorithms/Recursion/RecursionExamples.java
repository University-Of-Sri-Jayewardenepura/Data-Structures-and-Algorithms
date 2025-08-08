package dsa.algorithms.recursion;

public class RecursionExamples {
    public static long factorial(int n){ return n<=1?1:n*factorial(n-1); }
    public static int triangle(int n){ return n<=1? n : n + triangle(n-1); }
    public static long fib(int n){ return n<=1? n : fib(n-1)+fib(n-2); }
    public static void hanoi(int n, char from, char aux, char to){ if(n==0) return; hanoi(n-1, from, to, aux); System.out.println("Move "+n+" from "+from+" to "+to); hanoi(n-1, aux, from, to);}    
}

