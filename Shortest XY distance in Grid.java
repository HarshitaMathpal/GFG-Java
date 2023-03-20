class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        // code here
        ArrayList<int[]> l1 = new ArrayList<>();
        ArrayList<int[]> l2 = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(grid.get(i).get(j)=='X'){
                    l1.add(new int[]{i,j});
                }
                if(grid.get(i).get(j)=='Y'){
                    l2.add(new int[] {i,j});
                }
            }
        }
        
        int ans = Integer.MAX_VALUE;
        
        for(int[] a:l1 ){
            for(int[] b:l2){
                ans = Math.min(ans,Math.abs(a[0]-b[0]) + Math.abs(a[1]-b[1]));
            }
        }
        return ans;
    }
};
