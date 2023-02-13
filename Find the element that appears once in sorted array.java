class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        if(n==1) 
            return arr[0];
        else if(arr[0]!=arr[1]) 
            return arr[0];
        else if(arr[n-1]!=arr[n-2]) 
            return arr[n-1];
            
        for(int i=0;i<n;i+=2){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
