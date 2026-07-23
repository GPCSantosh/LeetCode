class Solution {
    public int totalHammingDistance(int[] nums) {
        int totalDistance = 0;
        int n = nums.length;
        for (int i = 0; i < 32; i++) {
            int bitCountOnes = 0;
            for (int num : nums) {
                bitCountOnes += (num >> i) & 1;
            }
            int bitCountZeros = n - bitCountOnes;
            totalDistance += bitCountOnes * bitCountZeros;
        }        
        return totalDistance;
    }
}