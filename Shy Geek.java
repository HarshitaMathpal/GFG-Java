class Solution{
    
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    static long find(int n, long k){
        // Return the number of chocolates Geek had
        // enjoyed out of 'n' chocolates availabe in the
        // 'shop'.
        int x = shop.get(n);
        int maxchoc =0;
        int left = 0;
        int right = n-1;
        
        while(k>0){
            int maxp = 0;
            while(left <= right){
                int mid = left + (right-left)/2;
                int price = shop.get(mid);
                if(price>k){
                    right = mid-1;
                }
                else{
                    maxp = price;
                    left = mid+1;
                }
            }
            if(maxp==0)
                break;
            
            int numchoc = (int)k/maxp;
            maxchoc += numchoc;
            k = k % maxp;
            left = 0;
        }
        return maxchoc;
    
    }

}
