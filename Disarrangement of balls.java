class Solution{
    static int mod = 1000000007;
    static long disarrange(int n){
        // code here
        long[] dp = new long[n+1];
        // Arrays.fill(-1);
        long ans = findarrange(n,dp);
        return ans;
    }
    
    static long findarrange(int n,long[] dp){
        if(n==1)
        return 0;
        
        if(n==2)
        return 1;
        
        if(dp[n] != 0){
            return dp[n];
        }
        
        dp[n] = ((n-1) * ((findarrange(n-1,dp)%mod) + (findarrange(n-2,dp)%mod))%mod)%mod;
        
        return dp[n]; 
    }
}
