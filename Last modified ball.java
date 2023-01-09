class Solution {
    int solve(int N, int[] A) {
        // code here
        if(A[N-1] < 9){
            return N;
        }
        int i=1;
        while(A[N-i] >= 9){
            i++;
        }
        return N-i+1;
    }
};
