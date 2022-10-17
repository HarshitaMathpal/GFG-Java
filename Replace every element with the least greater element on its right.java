class Solution {
    static class Node{
        int  data;
        Node left;
        Node right;
        public Node(int d)
        {
            data = d;
            left = null;
            right = null;
        }
    }
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Node root = new Node(arr[arr.length-1]);
        ans.add(-1);
        for(int i=arr.length-2;i>=0;i--){
            Node curr = root;
            Node temp = new Node(arr[i]);
            insertinBST(curr,temp);
            int val = succ(root,temp);
            ans.add(val);
        }
        Collections.reverse(ans);
        return ans;
        
    }
    
    public static void insertinBST(Node curr,Node temp){
        while(curr!=null)
            {
                if(curr.data>temp.data)
                {
                    if(curr.left==null)
                    {
                        curr.left = temp;
                        break;
                    }
                    curr = curr.left;
                }
                else if(curr.data<temp.data)
                {
                    if(curr.right==null)
                    {
                        curr.right = temp;
                        break;
                    }
                    curr = curr.right;
                }
                else{
                    break;
                }
            }
            return;
    }
    
    public static int succ(Node root,Node temp){
        Node curr = root;
        int ans = -1;
        while(curr!=null)
        {
            if(curr.data<=temp.data)
            {
                curr = curr.right;
            }else{
                ans = curr.data;
                curr = curr.left;
            }
        }
        return ans;
    }
}
