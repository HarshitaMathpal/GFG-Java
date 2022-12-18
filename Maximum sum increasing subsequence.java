class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int[] dp = new int[n];
	    for(int i=0;i<n;i++){
	        dp[i] = arr[i];
	    }
	    int maxsum = 0;
	    for(int i=1;i<n;i++){
	        for(int j=0;j<i;j++){
	            if(arr[i]>arr[j]){
	                dp[i] = Math.max(dp[i],arr[i]+dp[j]);
	            }
	         }
	    }
	    for(int i=0;i<n;i++){
	        maxsum = Math.max(dp[i],maxsum);
	    }
	    return maxsum;
	}  
}
