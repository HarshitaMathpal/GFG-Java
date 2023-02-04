class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return findsum(arr,0,n,dp);
    }
    public static int findsum(int[] arr,int curr,int n,int[] dp){
        if(curr>=n)
            return 0;
        
        if(dp[curr] != -1)
            return dp[curr];
        
        int take =arr[curr] + findsum(arr,curr+2,n,dp);
        int notake = findsum(arr,curr+1,n,dp);
        
        return dp[curr] = Math.max(take,notake);
    }
}
