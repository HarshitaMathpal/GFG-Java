class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int maxsum = Integer.MIN_VALUE;
        
        while(!que.isEmpty()){
            int size = que.size();
            int sum = 0;
            while(size-->0){
                Node currnode = que.remove();
                sum += currnode.data;
                if(currnode.left != null){
                    que.add(currnode.left);
                }
                if(currnode.right != null){
                    que.add(currnode.right);
                }
                
            }
            maxsum = Math.max(sum,maxsum);
        }
        
        return maxsum;
    }
}
