class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer>memo=new HashMap<>();
        int count=0;
        int result=0;
        for(int val:nums){
            int val2=reverse(val);
            count=memo.getOrDefault(val-val2,0);
            memo.put(val-val2,count+1);
            result=(result+count)%1000000007;
        }
        return result;
    }
    public static int reverse(int num){
        int b=0;
        while(num>0){
            b=b*10+num%10;
            num/=10;
        }
        return b;
    }
}
