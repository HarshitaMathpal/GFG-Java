class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        Queue<Integer>q=new LinkedList<>();
       int lvl=0;
       q.add(0);
       boolean visited[]=new boolean[100001];
       while(q.size()>0)
       {
           int size=q.size();
           while(size-->0)
           {
               int curr=q.remove();
               visited[curr]=true;
               if(curr==X)
               return lvl;
               
               for(int a:adj.get(curr))
               {
                   if(!visited[a])
                   q.add(a);
               }
           }
           lvl++;
       }
       
    return -1;
    }
}
