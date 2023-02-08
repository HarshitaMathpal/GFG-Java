class Solution {
    long[] countZero(int n, int k, int[][] arr){
        // code here
        long ans[]=new long[k];

        HashSet<Integer> row=new HashSet<>();

        HashSet<Integer> col=new HashSet<>();

        for(int i=0;i<k;i++){

           row.add(arr[i][0]);

           col.add(arr[i][1]);

           ans[i]=(n-row.size())*(n-col.size());

        }

        return ans;
    }
}
