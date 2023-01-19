class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        return Math.min(findcount(A,B,C,D),findcount(A,B,D,C));
        
    }
    
    public int findcount(int A,int B,int C,int D){
        int count = 0;
        while(A>C){
            A /= 2;
            count++;
        }
        while(B>D){
            B /= 2;
            count++;
        }
        
        return count;
    }
   
}
