class Solve {
    int[] printUnsorted(int[] nums, int n) {
        // code here
     
        int[] temp = Arrays.copyOf(nums, n);
        Arrays.sort(temp);
        int start = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != temp[i]){
                start = i;
                break;
            }
        }
        int end = 0;
        for(int i=n-1; i>=0; i--){
            if(nums[i] != temp[i]){
                end = i;
                break;
            }
        }
        return new int[] {start,end};
    }
}
