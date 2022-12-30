class Solution{
    static String printMinNumberForPattern(String s){
        // code here
        String ans = "";
        String smallans = "1";
        int val = 2;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'D'){
                smallans = val + smallans;
                val++;
            }
            else if(s.charAt(i) == 'I'){
                ans += smallans;
                smallans = "";
                smallans += val;
                val++;
            }
            
        }
        ans += smallans;
        return ans;
    }
}
