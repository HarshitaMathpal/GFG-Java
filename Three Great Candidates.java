class Solution {
    long maxProduct(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        
        return (long)Math.max((long)arr[n-1]*arr[n-2]*arr[n-3],(long)arr[0]*arr[1]*arr[n-1]);
        
    }
}
