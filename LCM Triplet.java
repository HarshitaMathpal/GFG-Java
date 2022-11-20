class Solution {
    long lcmTriplets(long N) {
        // code here
        long ans = 0;
        if(N<=2){
            return N;
        }
        if(N%2 != 0){
            ans = N * (N-1) * (N-2);
        }
        else {
            if(N%3==0){
                ans = (N-1)*(N-2)*(N-3);
            }
            else{
                ans = N*(N-1)*(N-3);
            }
        }
        return ans;
    }
}
