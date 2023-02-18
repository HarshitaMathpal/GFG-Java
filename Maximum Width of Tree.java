class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        
        Queue<Node> que = new LinkedList<>();
        int maxsize = 0;
        
        que.add(root);
        
        while(!que.isEmpty()){
            int size = que.size();
            
            maxsize = Math.max(size,maxsize);
            
            while(size-->0){
                Node currnode = que.remove();
                
                if(currnode.left != null){
                    que.add(currnode.left);
                }
                if(currnode.right != null){
                    que.add(currnode.right);
                }
            }
        }
        
        return maxsize;
    }
}
