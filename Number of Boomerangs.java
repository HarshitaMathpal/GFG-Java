class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++){
            hm.clear();                       //doing this to clear hashmap to store values for next point.
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                int dist = (points[i][0] - points[j][0])*(points[i][0] - points[j][0]) + (points[i][1] - points[j][1])*(points[i][1] - points[j][1]);
                count += hm.getOrDefault(dist,0)*2;                    //*2 bcz we want combination.
                hm.put(dist,hm.getOrDefault(dist,0)+1);
            }
        }
        return count;
    }
}
