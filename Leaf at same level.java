class Solution
{
    boolean check(Node root)
    {
	// Your code here
	    Queue<Node> que = new LinkedList<>();
	    Set<Integer> al = new HashSet<>();
	    que.add(root);
	    int level = 0;
	    while(!que.isEmpty()){
	        int size = que.size();
	        level++;
	        for(int i=0;i<size;i++){
	            Node currnode = que.remove();
	            if(currnode != null && currnode.right == null && currnode.left == null){
	                al.add(level);
	            }
	            if(currnode.left != null)
	                que.add(currnode.left);
	            if(currnode.right != null)
	                que.add(currnode.right);
	        }
	    }
	    if(al.size()==1)
	    return true;
	    
	    return false;
	    
    }
}
