class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        if (root == null) {
            return new ArrayList<>();
        }
        
        int level=1;
        Queue<Node> queue= new LinkedList<>();
        List<List<Integer>>temp= new ArrayList<>();
        queue.add(root);
        
        ArrayList<Integer>ans=new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tarp = new ArrayList<>();
            while (size != 0) {
                Node currentnode = queue.remove();
                tarp.add(currentnode.data);

                if (currentnode.left != null) {
                    queue.add(currentnode.left);
                }
                if (currentnode.right != null) {
                    queue.add(currentnode.right);
                }
                size--;
            }
            if(level%2==1){
                Collections.reverse(tarp);
                ans.addAll(tarp);
            }
            else{
                ans.addAll(tarp);
            }
            level++;

        }
        return ans;
    }
}
