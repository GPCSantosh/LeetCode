class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> look= new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int complement = target - nums[i];
            if(look.containsKey(complement)){
                return new int[]{look.get(complement), i};
            }
            look.put(nums[i], i);
        }
        return new int[]{};
    }
}