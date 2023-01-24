class Solution {
    // Return the Kth smallest element in the given BST
    int count = 0;
    int res = -1;
    
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        smallElementHelper(root,K);
        return res;
    }
    public void smallElementHelper(Node root,int K){
        if(root==null)
            return;
        
        smallElementHelper(root.left,K);
        count++;
        if(count==K){
            res = root.data;
            return;
        }
        smallElementHelper(root.right,K);
    }
}
