class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
	    int n=x.length();
        int sum=0;
        for(int i=0;i<n;i++){
          sum=(sum*10+(x.charAt(i)-'0'))%11;
        }
      
      return sum;
	}
} 
