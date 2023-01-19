class Level_Order_Traverse
{
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        traversal(root,ans);
        return ans;
    }
    
    public static void traversal(Node root,ArrayList<ArrayList<Integer>> ans){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()){
            int size = que.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node currnode = que.remove();
                
                if(currnode.left != null){
                    que.add(currnode.left);
                }
                if(currnode.right != null){
                    que.add(currnode.right);
                }
                temp.add(currnode.data);
            }
            ans.add(temp);
        }
        
    }
}
