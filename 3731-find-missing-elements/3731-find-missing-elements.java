class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int start = nums[0];
        int end = nums[n-1];
        int idx = 0;
        for(int i = start ; i <= end ; i++){
            if(idx < n && nums[idx] == i) idx++;
            else arr.add(i);
        }
        return arr;
    }
}