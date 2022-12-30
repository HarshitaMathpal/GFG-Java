class Complete{
    
   
    // Function for finding maximum and value pair
    public static int save_gotham (int arr[], int n) {
        //Complete the function
         Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            nge[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }
        int sum = 0;
        for(int i:nge){
            sum += i;
        }
        return sum%1000000001;
    }
    
    
}

