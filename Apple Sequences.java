class Solution{
    public static int appleSequence(int n, int m, String s){
        //code here
        int flipa=perfectstring(s,'O',m);
        return flipa;
//     int flipb=perfectstring(s,'b',k);
//     return Math.max(flipa,flipb);
    }
    
    public static int perfectstring(String str,char ch,int k){

  
    int si=0;
    int ei=0;
    int ans=0;
    int flip=0;
    while(ei<str.length()){
      if(str.charAt(ei)==ch){
        flip++;
      }
      while(flip>k){
        if(str.charAt(si)==ch){
          flip--;
        }
        si++;

      }
      ans=Math.max(ans,ei-si+1);
      ei++;
    }
    return ans;
    }
}
