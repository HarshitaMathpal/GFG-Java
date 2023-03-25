


class Solution
{
    //check the visited array. If all elements are visited then all the elements of visited array must be true
    static int count=1;
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        //it is directed graph, so we have to pass all vertex
        for(int currentVertex =0;currentVertex<V;currentVertex++){
            boolean [] visited = new boolean[V];
            count=0;
            dfs(adj,currentVertex,V,visited);
            if(count==V){
                return currentVertex;
            }
            
        }
        return -1;
    }
    public static int dfs(ArrayList<ArrayList<Integer>>adj,int src,int V,boolean [] visited){
        //mark the vertex to be visited
        visited[src]=true;
        //call for non-visited neighbours
        count++;
        for(int nbr:adj.get(src)){
            if(visited[nbr]==false) 
            dfs(adj,nbr,V,visited);
        }
        
        return count;
    }
}
