class Solution {
    int dp[];
    int helper(int n)
    {
        if(n<=2)
        {
            return n;
        }
        if(dp[n]!=-1)
        return dp[n];
        int first=helper(n-1);
        int second=helper(n-2);
        return dp[n]=first+second;
    }
    public int climbStairs(int n) {
        dp= new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n);
    }
}
