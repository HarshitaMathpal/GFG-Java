class Solution
{
    /*You are required to complete this method*/
    int max_val(int arr[], int n)
    {
	// Your code
	int i=0,j=n-1;
	int max = Integer.MIN_VALUE;
	while(i<j){
	    max = Math.max(max,Math.abs(i-j) * Math.min(arr[i],arr[j]));
	    if(arr[i]<arr[j])
	    i++;
	    else
	    j--;
	}
	return max;
    }
}
