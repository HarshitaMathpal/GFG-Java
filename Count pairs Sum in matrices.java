class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        HashSet<Integer> hs1 = new HashSet<>();
        // HashSet<Integer> hs2 = new HashSet<>();
        
        int ans = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                hs1.add(mat2[i][j]);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(hs1.contains(x-mat1[i][j]))
                    ans += 1;
            }
        }
        
        return ans;
    }
}
