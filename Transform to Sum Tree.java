class Solution{
    public void toSumTree(Node root){
         //add code here.
         convertTree(root);
    }
    
    public int convertTree(Node root){
        if(root == null)
            return 0;
            
        int a = convertTree(root.left);
        int b = convertTree(root.right);
        int x = root.data;
        root.data = a + b;
        return a+b+x;
    }
}
