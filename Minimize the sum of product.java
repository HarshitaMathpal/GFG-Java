class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        long sum = 0;
        int len = (int)n;
        for(int i=0;i<n;i++){
            sum += a[i] * b[len-i-1];
        }
        
        return sum;
    }
}
