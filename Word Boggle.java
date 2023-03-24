class Solution
{
    public String[] wordBoggle(char board[][], String[] words)
    {
        // Write your code here
        HashSet<String>set=new HashSet<>();
        for(String currword:words){
            if(isWordExist(board,currword))
                set.add(currword);
        }
        String[] ans=new String[set.size()];
        int j=0;
        for(String i:set){
            ans[j++]=i;
        }
        return ans;
    }
    public boolean isWordExist(char[][] board, String word){
        // Code here
        int m =board.length;
        int n =board[0].length;
        
        for(int currRow=0 ;currRow <m;currRow++){
            for(int currCol =0;currCol<n;currCol++){
                if(board[currRow][currCol]==word.charAt(0) && findword(board,currRow,currCol,0,word,m,n))
                    return true;
            }
        }
        return false;
    }
    private boolean findword(char[][] board, int currRow , int currCol, int currindx,String word, int m ,int n){
        
        if(currindx>=word.length())
            return true;
        
         if(currRow<0 || currRow>=m || currCol<0 || currCol>=n ||board[currRow][currCol]!=word.charAt(currindx))
            return false;
        
        
        char temp = board[currRow][currCol];
        board[currRow][currCol]='.';
        
        boolean found = findword(board,currRow-1,currCol,currindx+1,word,m,n);
        found = found || findword(board,currRow+1,currCol,currindx+1,word,m,n);
        found = found || findword(board,currRow,currCol-1,currindx+1,word,m,n);
        found = found || findword(board,currRow,currCol+1,currindx+1,word,m,n);
        found=found || findword(board,currRow-1,currCol-1,currindx+1,word,m,n);
        found=found || findword(board,currRow+1,currCol-1,currindx+1,word,m,n);
        found=found || findword(board,currRow-1,currCol+1,currindx+1,word,m,n);
        found=found || findword(board,currRow+1,currCol+1,currindx+1,word,m,n);
        board[currRow][currCol]=temp;
        
        return found;
    
    }
}
