class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = words.length;
        for(String s:words){
            for(int i=0;i<s.length();i++){
                if(!allowed.contains(s.charAt(i)+"")){
                    c--;
                    break;
                }
            }
        }
        return c;
    }
}
