class Solution
{
	int getLevelDiff(Node root)
	{
	    //code here
	    if(root==null)
	    {
	        return 0;
	    }
	    
	    int odd=0, even=0, level=1;
	    Queue<Node> q=new LinkedList<>();
	    
	    q.offer(root);
	    
	    while(!q.isEmpty())
	    {
	        int size=q.size();
	        for(int i=0; i<size; i++)
	        {
	            Node temp=q.poll();
	            //adding value by its level
	            if(level%2!=0)
	                odd=odd+temp.data;
	            else
	                even=even+temp.data;
	            
	            //adding node to the queue
	            if(temp.left!=null)
	                q.offer(temp.left);
	            if(temp.right!=null)
	                q.offer(temp.right);
	        }
	        level++;
	    }
	    
	    return odd-even;
	}
}
