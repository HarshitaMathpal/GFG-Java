class GfG
{
          public static int num(int a[], int n, int k)
            {
                 //Your code here
                 int count = 0;
                 
                 for(int i=0;i<n;i++){
                     int x = a[i];
                     while(x>0){
                         if(x % 10 == 1){
                             count++;
                         }
                         x /= 10;
                     }
                 }
                 
                 return count;
            }
}
