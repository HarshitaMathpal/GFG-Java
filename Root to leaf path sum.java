class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int S) {
        // Your code here
        return hasSum(root,S,0);
        
    }
    
    static boolean hasSum(Node root,int S,int sum){
        if(root==null)
        return false;
        
        if(root.left==null && root.right==null){
            sum+=root.data;
            if(S==sum)
            return true;
        }
        
        return hasSum(root.left,S,sum+root.data)? true:hasSum(root.right,S,sum+root.data);
    }
    
    
}
