class Solution {
    public int minimumRounds(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int n : nums) {
            arr.put(n, arr.getOrDefault(n, 0) + 1);
        }
        int res = 0;
        // for(Map.entry<Integer, Integer> entry : arr.entrySet()){
        //     int cnt = 0;
            // arr.entrySet().removeIf(entry->entryValue() == 1);
        // }
        for(int freq : arr.values()){
            if(freq == 1){
                return -1;
            }
            res += (freq + 2)/3;
        }
        return res;
    }
}