class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		int tsum = 0;
	
		for(int i=0;i<N;i++){
	        tsum += A[i];	    
		}
		
		int presum = 0;
		for(int i=0;i<N;i++){
		    presum += A[i];
		    if(presum==tsum){
		        return i+1;
		    }
		    tsum -= A[i];
		}
		
		return -1;
	}
}
