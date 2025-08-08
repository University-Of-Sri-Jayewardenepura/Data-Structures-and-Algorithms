package dsa.algorithms.hashing;

import java.util.*;

public class SimpleHashingExamples {
    // Demonstrates folding method for long keys (e.g., strings to int key)
    public static int foldHash(String s, int mod){ int sum=0, factor=1, group=0, cnt=0; for(int i=0;i<s.length();i++){ group += s.charAt(i) * factor; factor *= 27; cnt++; if(cnt==4){ sum += group; factor=1; group=0; cnt=0; } } sum += group; return Math.floorMod(sum, mod); }
    public static void main(String[] args){ System.out.println(foldHash("cats", 101)); }
}

