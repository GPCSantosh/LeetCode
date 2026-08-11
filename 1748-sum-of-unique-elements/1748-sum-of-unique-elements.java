class Solution {
    public int sumOfUnique(int[] nums) {
        int[] cnt = new int[101];
        int sum = 0;
        for(int num : nums){
            cnt[num]++;
        }
        for(int i = 0 ; i < cnt.length ; i++){
            if(cnt[i] == 1) sum += i;
        }
        return sum;
    }
}