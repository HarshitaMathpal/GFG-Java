class Solution
{
    //Function to merge two nodes a and b.
    public void union_(int a, int b, int parent[], int rank[])
    {
        // add your code here
        int rootA = findParentByPathCompression(parent,a);
        int rootB = findParentByPathCompression(parent,b);
        
        if(rank[rootA] > rank[rootB]){
            parent[rootB] = rootA;
        }
        else if(rank[rootA] < rank[rootB]){
            parent[rootA] = rootB;
        }
        else{
            parent[rootA] = rootB;
            rank[rootB] += 1;
        }
        
        return;
    }
    
    
    public static int findParentByPathCompression(int[] parent,int a){
        if(parent[a]==a)
            return a;
        
        else 
            parent[a] = findParentByPathCompression(parent,parent[a]);
        
        return parent[a];
    }

    //Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[])
    {
        // add your code here
        return findParentByPathCompression(par,a) == findParentByPathCompression(par,b);
    }

}
