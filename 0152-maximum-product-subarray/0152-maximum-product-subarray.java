class Solution {
    public int maxProduct(int[] nums) {
        int lrmaxi = Integer.MIN_VALUE, rlmaxi = Integer.MIN_VALUE, n = nums.length;
        int sum1 = 1;
        for (int i = 0; i < nums.length; i++) {
            sum1 *= nums[i];
            lrmaxi = Math.max(lrmaxi, sum1);
            if (nums[i] == 0) {
                sum1 = 1;
            }
        }
        int sum2 = 1;
        for(int i = n-1 ; i >= 0 ; i--){
            sum2 *= nums[i];
            rlmaxi = Math.max(rlmaxi, sum2);
            if (nums[i] == 0) {
                sum2 = 1;
            }
        }
        int max2 = Math.max(rlmaxi, lrmaxi);
        return max2;
    }
}
