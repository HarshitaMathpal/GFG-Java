class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        
        Queue<Node> que = new LinkedList<>();
        int maxsum = Integer.MIN_VALUE;
        que.add(root);
        while(!que.isEmpty()){
            int currsize = que.size();
            int currsum = 0;
            for(int i=0;i<currsize;i++){
                Node currnode = que.remove();
                currsum += currnode.data;
                if(currnode.left != null)
                    que.add(currnode.left);
                if(currnode.right != null)
                    que.add(currnode.right);
            }
            maxsum = Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}
