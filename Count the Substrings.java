class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        
        int ans=0;
        int sum=0;
        
        for(int i=0;i<S.length();i++){
            int val=0;
            char ch = S.charAt(i);
            if(Character.isUpperCase(ch)){
                val++;
            }
            else{
                val--;
            }
            sum += val;
            if(hm.containsKey(sum)){
                ans += hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        
        return ans;
    }
} 
