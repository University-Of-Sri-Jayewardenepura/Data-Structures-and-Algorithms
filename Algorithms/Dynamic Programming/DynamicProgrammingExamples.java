package dsa.algorithms.dp;

public class DynamicProgrammingExamples {
    public static long fibBottomUp(int n){ if(n<=1) return n; long[] dp=new long[n+1]; dp[1]=1; for(int i=2;i<=n;i++) dp[i]=dp[i-1]+dp[i-2]; return dp[n]; }
    public static long fibSpaceOptimized(int n){ if(n<=1) return n; long a=0,b=1; for(int i=2;i<=n;i++){ long c=a+b; a=b; b=c; } return b; }
    public static void main(String[] args){ System.out.println(fibBottomUp(10)); System.out.println(fibSpaceOptimized(50)); }
}

