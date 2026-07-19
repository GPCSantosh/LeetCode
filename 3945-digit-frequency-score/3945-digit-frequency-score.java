class Solution {
    public int digitFrequencyScore(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];
        int temp = n;
        if (temp == 0) {
            freq[0]++;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                freq[digit]++;
                temp /= 10;
            }
        }
        int score = 0;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                score += d * freq[d];
            }
        }        
        return score;
    }
}
