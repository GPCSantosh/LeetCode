class Solution {
    public int lastStoneWeight(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < n ; i++){
            pq.add(arr[i]);
        }
        while(pq.size() > 1){
            int t1 = pq.poll();
            int t2 = pq.poll();
            if(t1 != t2) pq.add(Math.abs(t1-t2));
        }
        if(pq.size() > 0)
            return pq.peek();
        return 0;
    }
}