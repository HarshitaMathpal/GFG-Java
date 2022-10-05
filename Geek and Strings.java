class Solution{
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
        // code here
        
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(String s:li){
            for(int i=1;i<=s.length();i++){
                String temp = s.substring(0,i);
                hm.put(temp,hm.getOrDefault(temp,0)+1);
            }
        }
        for(String q:query){
            ans.add(hm.getOrDefault(q,0));
        }
        
        return ans;
    }
}
