class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int j = 0;
        int zero = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[j] == 0){
                    zero--;
                }
                j++;
            }
            sum = Math.max(sum, i-j+1);
        }
        return sum;
    }
}