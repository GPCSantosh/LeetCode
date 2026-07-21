class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            oddSum += (2 * i + 1);
            evenSum += (2 * i + 2);
        }
        return gcd(oddSum, evenSum);
    }
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}