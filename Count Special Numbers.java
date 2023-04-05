class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        // Code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        int count = 0;
        
        for(int i=0;i<N;i++){
            if(hm.containsKey(arr[i])){
                for(int j=0;j<N;j++){
                    if(i!=j && arr[i]%arr[j]==0){
                        count += hm.get(arr[i]);
                        hm.remove(arr[i]);
                        break;
                    }
                }
            }
        }
        
        return count;
    }
}
