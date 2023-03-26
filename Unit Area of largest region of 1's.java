class Solution
{
    //Function to find unit area of the largest region of 1s.
    static int count=0;
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int answer=0;
        int m=grid.length;
        int n=grid[0].length;

        for(int currentRow=0;currentRow<m;currentRow++){
            for(int currentCol=0;currentCol<n;currentCol++){
                if(grid[currentRow][currentCol]==1){
                    int ans=findsinkisland(grid,currentRow,currentCol,m,n);
                    answer=Math.max(answer,ans);
                    count=0;
                }
            }
        }

        return answer;
    }

    public static int findsinkisland(int[][] grid,int currentRow,int currentCol,int m,int n){
        if(currentRow<0 || currentRow>=m || currentCol<0 || currentCol>=n || grid[currentRow][currentCol]==0){
            return 0;
        }
        
        count++;
        
        grid[currentRow][currentCol]=0;

        findsinkisland(grid,currentRow-1,currentCol,m,n);// Up call

        findsinkisland(grid,currentRow+1,currentCol,m,n);// down call

        findsinkisland(grid,currentRow,currentCol-1,m,n);// left call

        findsinkisland(grid,currentRow,currentCol+1,m,n);// right call
        
        findsinkisland(grid,currentRow-1,currentCol-1,m,n);
        
        findsinkisland(grid,currentRow+1,currentCol-1,m,n);
        
        findsinkisland(grid,currentRow-1,currentCol+1,m,n);
        
        findsinkisland(grid,currentRow+1,currentCol+1,m,n);

        return count;

    }
}
