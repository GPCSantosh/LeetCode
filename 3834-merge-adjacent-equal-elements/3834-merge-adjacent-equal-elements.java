class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> arr = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            arr.add((long) nums[i]);
            int j = arr.size() - 1;
            while (j > 0 && arr.get(j).equals(arr.get(j - 1))) {
                long sum = arr.get(j) + arr.get(j - 1);
                arr.remove(j);
                arr.remove(j - 1);
                arr.add(sum);
                j = arr.size() - 1;
            }
            i++;
        }
        return arr;
        // Stack<Integer> s = new Stack<>();
        // for(int i = 0 ; i < n ; i++){
        //     if(nums[i] == nums[i+1]){
        //         int t = nums[i] + nums[i+1];
        //         s.push(t);
        //     }
        //     else s.push(nums[i]);
        // }
        // return s;
    }
}