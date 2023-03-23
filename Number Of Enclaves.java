class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int m = grid.length;
        int n = grid[0].length;
        
        int[] count = {0};
        
        for(int currentCol=0;currentCol<n;currentCol++){
            if(grid[0][currentCol]==1){
                dfsforCorner(grid,0,currentCol,m,n);
            }

            if(grid[m-1][currentCol]==1){
                dfsforCorner(grid,m-1,currentCol,m,n);
            }
        }
        
        for(int currentRow=0;currentRow<m;currentRow++){
            if(grid[currentRow][0]==1){
                dfsforCorner(grid,currentRow,0,m,n);
            }

            if(grid[currentRow][n-1]==1){
                dfsforCorner(grid,currentRow,n-1,m,n);
            }
        }
        
        for(int currentRow=0;currentRow<m;currentRow++){
            for(int currentCol=0;currentCol<n;currentCol++){
                if(grid[currentRow][currentCol]==1){
                    dfs(grid,currentRow,currentCol,m,n,count);
                }
            }
        }
        
        return count[0];
     }
     
      private static void dfsforCorner(int[][] grid,int currentRow,int currentCol,int m,int n){
        if(currentRow<0 || currentRow>=m || currentCol<0 || currentCol>=n || grid[currentRow][currentCol]==0){
            return;
        }


        grid[currentRow][currentCol]=0;// if we encountered 1 than changing it to 0 as visited

        dfsforCorner(grid,currentRow+1,currentCol,m,n);// down call
        
        dfsforCorner(grid,currentRow-1,currentCol,m,n);// up call
        
        dfsforCorner(grid,currentRow,currentCol+1,m,n);// right call
        
        dfsforCorner(grid,currentRow,currentCol-1,m,n);//left call
        return;
    }
    
    private static void dfs(int[][] grid,int currentRow,int currentCol,int m,int n,int[] count){
        if(currentRow<0 || currentRow>=m || currentCol<0 || currentCol>=n || grid[currentRow][currentCol]==0){
            return;
        }

        grid[currentRow][currentCol]=0;// if we encountered 1 than changing it to 0 as visited
        count[0]++;

        dfs(grid,currentRow+1,currentCol,m,n,count);// down call
        
        dfs(grid,currentRow-1,currentCol,m,n,count);// up call
        
        dfs(grid,currentRow,currentCol+1,m,n,count);// right call
        
        dfs(grid,currentRow,currentCol-1,m,n,count);//left call
        return;
    }
}
