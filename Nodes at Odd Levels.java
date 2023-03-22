class Solution{
    public ArrayList<Node> nodesAtOddLevels(Node root)
    {
        //code here
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int level = 1;
        ArrayList<Node> al = new ArrayList<>();
        
        while(!que.isEmpty()){
            int size = que.size();
            
            while(size-->0){
                Node currnode = que.remove();
                if(level%2 != 0){
                    al.add(currnode);
                }
                
                if(currnode.left != null)
                    que.add(currnode.left);
                
                if(currnode.right != null)
                    que.add(currnode.right);
            }
            level++;
        }
        
        return al;
    }
}
