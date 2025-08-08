package dsa.algorithms.bit;

public class BitManipulation {
    public static int countSetBits(int n){ int c=0; while(n!=0){ n &= (n-1); c++; } return c; }
    public static boolean isPowerOfTwo(int n){ return n>0 && (n & (n-1))==0; }
    public static int getBit(int n, int i){ return (n>>i)&1; }
    public static int setBit(int n, int i){ return n | (1<<i); }
    public static int clearBit(int n, int i){ return n & ~(1<<i); }
}

