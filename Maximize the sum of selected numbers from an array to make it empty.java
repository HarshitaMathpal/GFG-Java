class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int sum = 0;
        for(int i=n-1;i>=0;i--){
            int t = arr[i];
            if(!hm.containsKey(t)) 
                continue;
            
            if(hm.get(t) == 1) 
                hm.remove(t);
            else
                hm.put(t , hm.getOrDefault(t , 0) - 1);
            
            if(hm.containsKey(t - 1)){
                sum += t;
                if(hm.get(t - 1) == 1) 
                    hm.remove(t - 1);
                else 
                    hm.put(t - 1 , hm.getOrDefault(t - 1 , 0) - 1);
            }
            else 
                sum += t;
        }
        return sum;
    }
    
    
}
