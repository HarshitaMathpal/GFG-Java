class Solution {
    static String isSumOfTwo(int N){
        // code here
        for(int i=2;i<N;i++){
            if(isPrime(i)){
                if(isPrime(N-i))
                return "Yes";
            }
        }
        return "No";
    }
    
    static boolean isPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
