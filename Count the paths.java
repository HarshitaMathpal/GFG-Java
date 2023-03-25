
class Solution
{
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        // Code here 
        List<List<Integer>> graph = constructGraph(edges,n);
        int[] ways = {0};
        
        return findPath(graph,s,d);
     
    }
    
    public int findPath(List<List<Integer>> graph,int src,int dest){
        if(src==dest){
            return 1;
        }
        int count=0;
        for(int nbrs:graph.get(src)){
            count+=findPath(graph,nbrs,dest);
        }
        
        return count;
    }
    
    public List<List<Integer>> constructGraph(int[][] edges,int n){
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] a:edges){
            int src = a[0];
            int dest = a[1];
            graph.get(src).add(dest);
            // graph.get(dest).add(src);
        }
        
        return graph;
    }
}
