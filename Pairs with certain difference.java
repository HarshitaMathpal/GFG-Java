class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        // Your code goes here 4
        Arrays.sort(arr);
        int sum = 0;
        
        for(int i=N-1;i>0;){
            if(Math.abs(arr[i]-arr[i-1]) < K){
                sum += arr[i] + arr[i-1];
                i -= 2;
            }
            else{
                i -= 1;
            }
        }
        
        return sum;
    }
    
}
