class Pair implements Comparable<Pair>{
    int vertex;
    int cost;
    
    Pair(int vertex,int cost){
        this.vertex = vertex;
        this.cost = cost;
    }
    
    public int compareTo(Pair p){
        return this.cost - p.cost;
    }
}
class Solution {

  public int[] shortestPath(int V,int M, int[][] edges) {
    //Code here
    ArrayList<ArrayList<ArrayList<Integer>>>adj=constructGraph(edges,V);
    int[] cost = new int[V];
        Arrays.fill(cost,-1);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        pq.add(new Pair(0,0));
        
        while(!pq.isEmpty()){
            Pair currpair = pq.remove();
            int currvertex = currpair.vertex;
            int currcost = currpair.cost;
            
            if(cost[currvertex] != -1)
            continue;
            
            cost[currvertex] = currcost;
            
            ArrayList<ArrayList<Integer>> neighbour = adj.get(currvertex);
            for(ArrayList<Integer> current : neighbour){
                int currneighbour = current.get(0);
                int curredgecost = current.get(1);
                
                pq.add(new Pair(currneighbour,curredgecost+currcost));
            }
        
        }
        
        return cost;
        
    
  }
  
  
  private ArrayList<ArrayList<ArrayList<Integer>>> constructGraph(int[][] times,int n){
        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<ArrayList<Integer>>());
        }

        for(int[] edge : times){
            int src = edge[0];
            int dest = edge[1];
            int time = edge[2];

            ArrayList<Integer> neigh = new ArrayList<>();

            neigh.add(dest);
            neigh.add(time);

            graph.get(src).add(neigh);
        }

        return graph;
    }
}
