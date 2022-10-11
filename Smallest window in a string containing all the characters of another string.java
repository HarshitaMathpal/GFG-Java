class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String t)
    {
        // Your code here
        String ans = "";
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char a = t.charAt(i);
            map2.put(a,map2.getOrDefault(a,0)+1);
        }
        int matchcnt =0;
        int desiremct = t.length();
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        int i=-1;
        int j=-1;
        
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            
            // acquiring the window and increasing the matchcount if required.
            while(i < s.length()-1 && matchcnt < desiremct){
                i++;
                char ch = s.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                
                if(map1.getOrDefault(ch,0) <= map2.getOrDefault(ch,0)){
                    matchcnt++;
                }
                f1=true;
            }
            
            // collect ans and release the window.
            while(j < i && matchcnt == desiremct){
                String tempans = s.substring(j+1,i+1);
                if(ans.length() ==0 || tempans.length() < ans.length()){
                    ans = tempans;
                }
                j++;
                
                char ch = s.charAt(j);
                if(map1.get(ch)==1){
                    map1.remove(ch);
                }
                else{
                    map1.put(ch,map1.get(ch)-1);
                }
                
                if(map1.getOrDefault(ch,0) < map2.getOrDefault(ch,0)){
                    matchcnt--;
                }
                
                f2=true;
            }
            if(f1 == false && f2 == false)
                break;
        }   
        if(ans.equals(""))
        return "-1";
        
        return ans;
    }
}
