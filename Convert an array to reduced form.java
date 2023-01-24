class Solution {
    void convert(int[] arr, int n) {
        //Code here
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<temp.length;i++){
            hm.put(temp[i],i);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = hm.get(arr[i]);
        }
        
    }
}
