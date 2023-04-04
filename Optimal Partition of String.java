class Solution {
    public int partitionString(String s) {
        int substringCount = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                substringCount++;
                set.clear();
            }
            set.add(ch);
        }

        return substringCount+1;
    }
}
