class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()){
            int currsize = que.size();
            
            int max = Integer.MIN_VALUE;
            for(int i=0;i<currsize;i++){
                Node currnode = que.remove();
                max = Math.max(currnode.data,max);
                if(currnode.left != null)
                    que.add(currnode.left);
                
                if(currnode.right != null)
                    que.add(currnode.right);
            }
            
            ans.add(max);
        }
        return ans;
    }
}
