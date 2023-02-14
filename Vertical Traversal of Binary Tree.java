class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        Queue<Pair>queue=new LinkedList<>();
        Map<Integer,ArrayList<Integer>>memo=new TreeMap<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair currentPair=queue.remove();
            Node currentNode=currentPair.node;
            int hd=currentPair.hd;
            
            if(memo.containsKey(hd)){
                memo.get(hd).add(currentNode.data);
            }
            
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(currentNode.data);
                memo.put(hd,temp);
            }
            
            if(currentNode.left!=null){
                queue.add(new Pair(currentNode.left,hd-1));
            }
            
            if(currentNode.right!=null){
                queue.add(new Pair(currentNode.right,hd+1));
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(Integer i:memo.keySet()){
            ans.addAll(memo.get(i));
        }
        return ans;
    }
}
