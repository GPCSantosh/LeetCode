class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);        
        long totalSum = 0;
        int n = nums.length;
        int tripletsCount = n / 3;
        int index = n - 2;
        for (int i = 0; i < tripletsCount; i++) {
            totalSum += nums[index];
            index -= 2;
        }        
        return totalSum;
    }
}