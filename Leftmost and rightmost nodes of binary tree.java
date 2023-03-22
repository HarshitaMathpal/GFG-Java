class Tree
{
    public static void printCorner(Node node)
    {
        
        // add your code here   
        Queue<Node> que = new LinkedList<>();
        que.add(node);
        
        while(!que.isEmpty()){
            int size = que.size();
            ArrayList<Integer> al = new ArrayList<>();
            while(size-->0){
                Node currnode = que.remove();
                al.add(currnode.data);
                
                if(currnode.left != null){
                    que.add(currnode.left);
                }
                
                if(currnode.right != null){
                    que.add(currnode.right);
                }
            }
            if(al.size()==1){
                System.out.print(al.get(0)+" ");
            }
            else{
            System.out.print(al.get(0)+" ");
            System.out.print(al.get(al.size()-1)+" ");
        
            }
            }
        
        return;
    }
    
}
