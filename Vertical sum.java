class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node = node;
        this.hd = hd;
    }
}

class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(root,0));
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(!que.isEmpty()){
            int size = que.size();
            while(size-->0){
                Pair currpair = que.remove();
                Node currnode = currpair.node;
                int hd = currpair.hd;
                max = Math.max(max,hd);
                min = Math.min(min,hd);
            
                if(hm.containsKey(hd)){
                    ArrayList<Integer> al = hm.get(hd);
                    al.add(currnode.data);
                    hm.put(hd,al);
                }
                else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(currnode.data);
                    hm.put(hd,temp);
                }
                
                if(currnode.left != null){
                    que.add(new Pair(currnode.left,hd-1));
                }
            
                if(currnode.right != null){
                    que.add(new Pair(currnode.right,hd+1));
                }
            }
        }
        
        for(int i=min;i<=max;i++){
            ArrayList<Integer> al = hm.get(i);
            int sum = 0;
            for(int j:al)
                sum += j;
            ans.add(sum);
        }
        
        // Collections.sort(ans);
        return ans;
    }
}
