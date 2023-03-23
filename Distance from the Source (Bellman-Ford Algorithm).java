class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
        int[] cost = new int[V];
        Arrays.fill(cost,(int)1e8);
        
        cost[S] = 0;
        
        for(int i=0;i<V-1;i++){
            for(ArrayList<Integer> curredge : edges){
                int src = curredge.get(0);
                int dest = curredge.get(1);
                int weight = curredge.get(2);
                
                if(cost[src] != (int)1e8){
                    cost[dest] = Math.min(cost[dest],cost[src]+weight);
                }
            }
        }
        
        for(ArrayList<Integer> curredge : edges){
                int src = curredge.get(0);
                int dest = curredge.get(1);
                int weight = curredge.get(2);
                
                if(cost[src] != (int)1e8 && cost[dest]>cost[src]+weight){
                    return new int[]{-1};
                }
        }
        return cost;
    }
}
