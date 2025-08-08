package dsa.algorithms.strings;

import java.util.*;

public class KMP {
    public static int indexOf(String text, String pattern){ if(pattern.isEmpty()) return 0; int[] lps = lps(pattern); int i=0,j=0; while(i<text.length()){ if(text.charAt(i)==pattern.charAt(j)){ i++; j++; if(j==pattern.length()) return i-j; } else if(j>0) j = lps[j-1]; else i++; } return -1; }
    private static int[] lps(String p){ int n=p.length(); int[] l=new int[n]; for(int i=1,len=0;i<n;){ if(p.charAt(i)==p.charAt(len)) l[i++]=++len; else if(len>0) len=l[len-1]; else l[i++]=0; } return l; }
    public static void main(String[] args){ System.out.println(indexOf("abxabcabcaby","abcaby")); }
}

