class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        Long p1 = arr[0]*arr[1]*arr[n-1];
        Long p2 = arr[n-3]*arr[n-1]*arr[n-2];
        
        return Math.max(p1,p2);
    }
}
