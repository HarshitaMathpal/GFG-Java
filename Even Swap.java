class Solution{
	int [] lexicographicallyLargest(int [] arr, int n) {
		//Write your code here
		 int i=1;
        while(i<n)
        {
           
           if(i!=0&&(arr[i]+arr[i-1])%2==0&&arr[i]>arr[i-1])
           {
               int temp=arr[i];
               arr[i]=arr[i-1];
               arr[i-1]=temp;
              i--;
           }
           else{
               i++;
           }
        }
        return arr;
	}
}
