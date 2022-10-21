class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int l=0;
        int r=C-1;
        int t=0;
        int b=R-1;
        int j=0;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                ans.add(a[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                ans.add(a[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    ans.add(a[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    ans.add(a[i][l]);
                }
                l++;
            }
        }
        Collections.reverse(ans);
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
