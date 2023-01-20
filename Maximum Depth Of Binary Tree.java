class Solution {
  public static int maxDepth(Node root) {
    // code here
        return findDepth(root);
  }
  public static int findDepth(Node root){
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
  }
}
  
