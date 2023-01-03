class Solution {
    public int removeStudents(int[] arr, int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0, arr[0]);
        int j = 0;
        for (int i = 1; i < n; i++){
            if (arr[i] > ans.get(j)){
                ++j;
                ans.add(j, arr[i]);
            }
            else{
                int index = lowerBound(ans, arr[i]);
                ans.set(index, arr[i]);
            }
        }
        
        return n-ans.size();

    }
    
    static int lowerBound(ArrayList<Integer> arr, int key) {
        int low = 0, high = arr.size();
        int mid;
    
        while (low < high)
        {
            mid = low + (high-low)/2;
            
            if (key <= arr.get(mid))
                high = mid;
            else
                low = mid+1;
            
        }
        if (low < arr.size() && arr.get(low) < key)
            low++;
            
        return low;
 
    
    }
};
