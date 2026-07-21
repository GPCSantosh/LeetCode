class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        for (int num : nums) {
            arr.add(num);
            if (arr.size() > k) {
                arr.poll();
            }
        }
        return arr.peek();
    }
}