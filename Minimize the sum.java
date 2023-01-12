class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i:arr){
            que.add(i);
        }
        int sum = 0;
        int x = 0;
        while(que.size() > 1){
         x = que.poll() + que.poll();
            sum += x;
            que.add(x);
        }
        
        return (long)sum;
        
    }
}
