class Solution {
    int maxGCD(Node root) {
        // code here 
        int[] ans = {-1,0};
        helper(root,ans); 
        return ans[1];
    }
    
    public void helper(Node root,int[] ans){
        if(root==null || (root.left == null && root.right == null)){
            return;
        }
        
        helper(root.left,ans);
        helper(root.right,ans);
        
        int leftdata = (root.left != null ? root.left.data : -1);
        int rightdata = (root.right != null ? root.right.data : -1);
        
        if(leftdata != -1 && rightdata != -1){
            int gcd = findgcd(leftdata,rightdata);
            if(ans[0]<gcd){
                ans[0] = gcd;
                ans[1] = root.data;
            }
        }
    }
    
    public int findgcd(int a ,int b){
        if(b==0)
            return a;
        else
            return findgcd(b,Math.abs(a-b));
    }
}
