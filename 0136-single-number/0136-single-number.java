class Solution {
    public int singleNumber(int[] nums) {
        // int n = nums.length, temp = 0;
        // for(int i = 0 ; i < n ; i++){
        //     temp = nums[i];
        //     for(int j = i ; j < n ; j++){
        //         if(temp != nums[j]){
        //             temp = nums[j];
        //         }
        //     }
        // }
        // return temp;
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}