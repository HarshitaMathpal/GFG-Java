class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int r[] =  new int[N];
        for(int i = N-1; i >= 0; i--){
            r[i] = set.size();
            set.add(A[i]);
        }
        set.clear();
        for(int i = 0; i < N;i++){
            ans.add(set.size() - r[i]);
            set.add(A[i]);
        }
        return ans;
    }
}
