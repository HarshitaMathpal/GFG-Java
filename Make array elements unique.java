class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<N-1;i++){
            if(arr[i+1] <= arr[i]){
                count += arr[i] - arr[i+1]+1;
                arr[i+1] = arr[i]+1;
            }
        }
        
        return count;
        
        
        
        
    }
}
