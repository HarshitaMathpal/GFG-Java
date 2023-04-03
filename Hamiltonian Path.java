class Solution 
{ 
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // code here
        ArrayList<ArrayList<Integer>>graph=ConstructGraph(N,Edges);
        
        boolean[] visited=new boolean[N+1];
        for(int i=1;i<N;i++){
            if(dfs(graph,i,1,N,visited)){
                return true;
            }
        }
        
        return false;
        
    }
    
    private static boolean dfs(ArrayList<ArrayList<Integer>>graph,int currentVertex,int count,int N,boolean[]visited){
        if(count==N){
            return true;
        }
        
        visited[currentVertex]=true;
        
        for(int currentNeigh:graph.get(currentVertex)){
            if(!visited[currentNeigh] && dfs(graph,currentNeigh,count+1,N,visited)){
                return true;
            }
        }
        
        visited[currentVertex]=false;
        return false;
    }
    
    private static ArrayList<ArrayList<Integer>>ConstructGraph(int n,ArrayList<ArrayList<Integer>>edges){
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer>currentEdges:edges){
            int a=currentEdges.get(0);
            int b=currentEdges.get(1);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        return graph;
        
        
    }
}
