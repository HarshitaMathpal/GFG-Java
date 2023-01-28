class Solution {
    static long isPerfectSquare(long n){
        // code here
         double d = Math.sqrt(n);
        int s = (int)Math.floor(d);
        
        if(n==s*s)
            return 1;
        
        return 0;
    }
}
