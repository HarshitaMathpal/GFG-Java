class Solution {
    static String lexicographicallySmallest(String s, int k) {
        // code here
        int n = s.length();
        if((n & (n-1)) == 0){
            k /= 2;
        }
        else{
            k *= 2;
        }
        if(k>=n){
            return "-1";
        }
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            
            while(st.size()>0 && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        for(int i=0;i<k;i++){
            st.pop();
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        return ans;
    }
}
