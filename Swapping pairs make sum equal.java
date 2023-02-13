class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        long sumA = 0;

        long sumB = 0;

        for(int i= 0; i < n; i++)

       sumA += A[i];

       for(int i= 0; i < m; i++)

       sumB += B[i];

       if((sumA+sumB)%2==1) 

        return -1;

        HashSet <Long > h = new HashSet <Long > ();

       for (int i = 0; i< m ; i++)

       h.add(B[i]);

       for (int i = 0 ; i <n ; i++){
            if (h.contains (A[i] +(sumB - sumA)/2))
                return 1;
            }

       return -1;
    }
}
