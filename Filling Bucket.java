class Solution {
    static int mod = 100000000;
    static int fillingBucket(int N) {
        // code here
        int[] dp = new int[N+1];
        Arrays.fill(dp,-1);
        return findways(N,0,dp);
    }
    static int findways(int N,int curr,int[] dp){
        if(curr == N){
            return 1;
        }
        if(curr>N){
            return 0;
        }
        if(dp[curr] != -1){
            return dp[curr];
        }
        
        int one = findways(N,curr+1,dp) % mod;
        int two = findways(N,curr+2,dp) % mod;
        return dp[curr] = (one+two) % mod;
    }
};
