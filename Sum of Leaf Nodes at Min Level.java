class Solution{
     public int minLeafSum(Node root){
        //code here
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int sum = 0;
        while(!que.isEmpty()){
            int size = que.size();
            for(int i=0;i<size;i++){
                Node currnode = que.remove();
                if(currnode.left == null && currnode.right == null){
                    sum += currnode.data;
                }
                if(currnode.left != null)
                    que.add(currnode.left);
                if(currnode.right != null)
                    que.add(currnode.right);
            }
            if(sum != 0)
                return sum;
        }
        return sum;
            
    }
}
