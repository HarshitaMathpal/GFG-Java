class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        // Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer>inp = new ArrayList<>();
        for(int i = 0; i < A.size(); i++){
                if(!inp.contains(A.get(i))){
                    inp.add(A.get(i));
                }
        }
        Collections.sort(inp);
        makecombs(inp,0,B,new ArrayList<>(),ans);
        
        
        return ans;
    }
    
    static void makecombs(ArrayList<Integer> candidates, int currindex,int target, ArrayList<Integer> currlist,ArrayList<ArrayList<Integer>> ans){
        
        if(target==0){
            // if(!ans.contains(currlist.get(currindex)));
            ans.add(new ArrayList<>(currlist));
            return;
        }
        
        if(currindex>=candidates.size())
            return;
        
        if(candidates.get(currindex)<=target){
            currlist.add(candidates.get(currindex));
            makecombs(candidates,currindex,target-candidates.get(currindex),currlist,ans);
            currlist.remove(currlist.size()-1);
        }
        
        makecombs(candidates,currindex+1,target,currlist,ans);
        
        return;
    }
}
