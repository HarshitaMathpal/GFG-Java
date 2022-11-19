class Solution {
    public static boolean areAnagrams(Node n1, Node n2) {
        // code here
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        
        q1.add(n1);
        q2.add(n2);
        
        while(!q1.isEmpty() && !q2.isEmpty()){
            int sz1 = q1.size();
            int sz2 = q2.size();
            
            if(sz1 != sz2)
                return false;
                
            HashMap<Integer,Integer> hm = new HashMap<>();
            
            for(int i=0;i<sz1;i++){
                Node a = q1.remove();
                Node b = q2.remove();
                hm.put(a.data,hm.getOrDefault(a.data,0)+1);
                hm.put(b.data,hm.getOrDefault(b.data,0)-1);
                
                if(a.left != null)
                    q1.add(a.left);
                if(a.right != null)
                    q1.add(a.right);  
                if(b.right != null)
                    q2.add(b.right); 
                if(b.left != null)
                    q2.add(b.left);
            }
            
            for(int key:hm.keySet()){
                if(hm.get(key)!=0)
                    return false;
                }
        
        }
        
        
        return true;
    }
}
        
