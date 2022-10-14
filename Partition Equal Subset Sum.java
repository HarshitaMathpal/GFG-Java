class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int totalsum = 0;
        for(int i:arr){
            totalsum += i;
        }
        if(totalsum % 2 != 0)
            return 0;
        int target = totalsum/2;
        
        int[][] dp = new int[N][target+1];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return checkpartition(arr,N-1,0,target,dp);
    }
    
    static int checkpartition(int[] arr, int n,int currindx,int sum,int[][] dp){
        if(sum == 0)
            return 1;
            
        if(currindx == n){
            if(arr[currindx]==sum)
                return 1;
            return 0;
        }
        
        if(dp[currindx][sum] != -1){
            return dp[currindx][sum] != 0 ? 1 : 0;
        }
        
        int notake = checkpartition(arr,n,currindx+1,sum,dp);
        int take = 0;
        if(sum>=arr[currindx]){
            take = checkpartition(arr,n,currindx+1,sum-arr[currindx],dp);
        }
        
        if(take==1 || notake==1){
            return dp[currindx][sum] = 1;
        }
        return dp[currindx][sum] = 0;
    }
}
