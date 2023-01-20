class Solution{
    static int isPrime(int N){
        // code here
        if(N==1)
            return 0;
        
        
            
        int j = 2;

        while(N>=j*j){
            if(N%j==0){
                return 0;
            }
            j++;
        }
        
        return 1;
    }
    
}
