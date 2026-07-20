class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);        
        long totalSum = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            j--;
            totalSum += nums[j];
            j--;
            i++;
        }        
        return totalSum;
    }
}