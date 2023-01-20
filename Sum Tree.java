class Solution
{
    boolean flag = true;
	boolean isSumTree(Node root)
	{
             // Your code here
             
            sumTree(root);
            return flag;
	}
	public int sumTree(Node root){
	    if(root==null)
	        return 0;
	    
	    if(root.left == null && root.right == null)
	        return root.data;
	       
	    int leftsum = sumTree(root.left);
	    int rightsum = sumTree(root.right);
	    
	    if(leftsum + rightsum != root.data)
	        flag = false;
	   
	    return leftsum+rightsum+root.data;
	}
}
