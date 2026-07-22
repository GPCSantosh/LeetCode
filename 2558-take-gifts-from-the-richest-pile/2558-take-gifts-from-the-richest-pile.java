class Solution {
    public long pickGifts(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < n ; i++){
            pq.add(arr[i]);
        }
        for(int i = 0 ; i < k ; i++){
            int temp = pq.poll();
            int res = (int)Math.sqrt(temp);
            pq.add(res);
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}