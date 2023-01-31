// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);

            for (int i = 0; i < n; i++)
                list.add(i, new ArrayList<Integer>());

            ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(v).add(u);
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(u);
                pair.add(v);
                prerequisites.add(pair);
            }

            int[] res = new Solution().findOrder(n, m, prerequisites);
            
            if(res.length==0)
                System.out.println("No Ordering Possible");
            else
            {
                if (check(list, n, res) == true)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int[] findOrder(int numCourses, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
       
    
        // add your code here
        ArrayList<ArrayList<Integer>>graph=Constructgraph(numCourses,prerequisites);
        int[] inDegree=new int[numCourses];
        

        for(int currentCourse=0;currentCourse<numCourses;currentCourse++){
            for(int currentNeigh:graph.get(currentCourse)){
                inDegree[currentNeigh]+=1;
            }
        }

        Queue<Integer>queue=new LinkedList<>();
        ArrayList<Integer>order=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }

        boolean[] visited=new boolean[numCourses];
        while(!queue.isEmpty()){
            int currentCourse=queue.remove();

            if(visited[currentCourse]){
                continue;

            }
            visited[currentCourse]=true;
            order.add(currentCourse);

            for(int currentNeigh:graph.get(currentCourse)){
                inDegree[currentNeigh]-=1;

                if(inDegree[currentNeigh]==0){
                    queue.add(currentNeigh);
                }
            }
        }
        if(order.size()!=numCourses){
            return new int[0];
        }
        int[] answer=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            answer[i]=order.get(i);
        }
        return answer;
    }
    private static ArrayList<ArrayList<Integer>> Constructgraph(int n,ArrayList<ArrayList<Integer>>edges){
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());

        }

        for(ArrayList<Integer> currentEdges:edges){
            int a=currentEdges.get(0);
            int b=currentEdges.get(1);
            graph.get(b).add(a);
        }
        return graph;
    }
}
