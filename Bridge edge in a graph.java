class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        // bridge is a special edge. when we remove this edge the number of component will be increse
        
        //before removing edge.. number of components
        boolean[] visited=new boolean[V];
        int count1=0;
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                count1++;
                dfs(adj,i,visited);
            }
        }
        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));
        //after removing edge... number of components
        visited=new boolean[V];
        int count2=0;
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                count2++;
                dfs(adj,i,visited);
            }
        }
        
        if(count2>count1){
            return 1;
        }
        return 0;
    }
    
    private static void dfs(ArrayList<ArrayList<Integer>> adj,int currentVertex,boolean[] visited){
        
        visited[currentVertex]=true;
        for(int nbrs:adj.get(currentVertex)){
            if(visited[nbrs]==false){
                dfs(adj,nbrs,visited);
            }
        }
        return;
    }
}
