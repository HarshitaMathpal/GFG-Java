class Solution {
    public int[][] solveQueries(int n, int[][] queries) {
        // Code here
        int[][] mat = new int[n][n];
        int len = queries.length;
        for(int i=0;i<len;i++){
           int a = queries[i][0];
           int b = queries[i][1];
           int c = queries[i][2];
           int d = queries[i][3];
           for(int j=a;j<=c;j++){
               for(int k=b;k<=d;k++){
                   mat[j][k]++;
               }
           }
        }
        
        return mat;
    }
}
