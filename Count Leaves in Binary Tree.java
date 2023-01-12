class Tree
{
    int countLeaves(Node node) 
    {
         // Your code  
         return count(node);
    }
    public int count(Node node){
        if(node == null)
            return 0;
            
        if(node.left== null && node.right == null){
            return 1;
        }
        int left = count(node.left);
        int right = count(node.right);
        return left + right;
    }
    
}
