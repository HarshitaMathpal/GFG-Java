

class Solution {
  public int solve(int a, int b) 
    {
        // code here
        if(a==b)
        {
            return 0;
        }
        int x=a&b;
        if(a>x && b>x)
        {
            return 2;
        }
        return 1;
    }
}
