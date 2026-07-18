class Solution {
    public int minBitFlips(int n, int m) {
        return Integer.bitCount(n ^ m);
    }
}