class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
        // add your code here
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int level = 0;
        int maxsize = Integer.MIN_VALUE;
        int ans = -1;
        while(!que.isEmpty()){
            
            int size = que.size();
            if(size>maxsize){
                maxsize = size;
                ans = level;
            }
            for(int i=0;i<size;i++){
                Node currnode = que.remove();
                if(currnode.left != null)
                    que.add(currnode.left);
                
                if(currnode.right != null)
                    que.add(currnode.right);
            }
            level++;
        }
        
        return ans;
        
    }
}
