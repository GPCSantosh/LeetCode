class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> arr = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(i > k){
                arr.remove(nums[i-k-1]);
            }
            if(!arr.add(nums[i])){
                return true;    
            }
        }
        return false;
    }
}