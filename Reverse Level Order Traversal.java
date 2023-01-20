class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        
        que.add(node);
        while(!que.isEmpty()){
            int size = que.size();
            
            for(int i=0;i<size;i++){
                Node curr = que.remove();
                ans.add(curr.data);
                
                if(curr.right != null)
                    que.add(curr.right);
                    
                if(curr.left != null)
                    que.add(curr.left);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}      
