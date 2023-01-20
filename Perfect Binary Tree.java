class Solution{
    public boolean isPerfect(Node root){
        //code here
        return height(root) != -1;
    }
    public static int height(Node root){
        if(root==null)
            return 0;
            
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        
        if(leftheight == -1 || rightheight == -1)
            return -1;
        
        if(leftheight != rightheight)
            return -1;
        
        return Math.max(leftheight,rightheight)+1;
    }
}
