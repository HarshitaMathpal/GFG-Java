class Solution
{
        
        int res = 0;
    public  int distributeCandy(Node root)
    {
        //code here
         Solution obj=new Solution();
        dfs(root);
        return res;
    }

    public  int dfs(Node root) {
        if (root == null) return 0;
        int left = dfs(root.left), right = dfs(root.right);
        res += Math.abs(left) + Math.abs(right);
        return root.data + left + right - 1;
    }
}
