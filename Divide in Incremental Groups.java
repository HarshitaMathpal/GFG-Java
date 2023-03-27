class Solution {
    public int countWaystoDivide(int N, int K) {
        // Code here
        int[][][] dp = new int[N+1][N-K+1][K+1];
        
        for(int[][] a:dp){
            for(int[] b:a)
                Arrays.fill(b,-1);
        }
        
        int[] arr = new int[N-K+1];
        for(int i=0;i<N-K+1;i++){
            arr[i] = i+1;
        }
        return findWays(arr,N,0,0,dp,K);
    }
    
    public int findWays(int[] arr,int tsum,int currsum,int currindx,int[][][] dp,int capacity){
        if(currsum>tsum || currindx>=arr.length){
            return 0;
        }
        if(capacity==0){
            if(currsum==tsum)
                return 1;
            return 0;
        }
        
        if(dp[currsum][currindx][capacity] != -1){
            return dp[currsum][currindx][capacity];
        }
        
        int take = 0;
        if(currsum<tsum && capacity>0){
            take = findWays(arr,tsum,currsum+arr[currindx],currindx,dp,capacity-1);
        }
        int notake = findWays(arr,tsum,currsum,currindx+1,dp,capacity);
        
        return dp[currsum][currindx][capacity] = take + notake;
    }
}
