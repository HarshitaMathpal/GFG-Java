class Solution
{
    /* Returns level of given data value */
    int getLevel(Node node, int key)  
    { 
        // Write your code 
        int level = 0;

        Queue<Node> que = new LinkedList<>();
        que.add(node);
        
        while(!que.isEmpty()){
            level++;
            int size = que.size();
            
            for(int i=0;i<size;i++){
                Node currnode = que.remove();
                if(currnode.data == key){
                    return level;
                }
                if(currnode.left != null)
                    que.add(currnode.left);
                if(currnode.right != null)
                    que.add(currnode.right);
            }
        }
        
        return 0;
    } 

}
