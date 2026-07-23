class Solution {
    private int count = 0;
    public int totalNQueens(int n) {
        count = 0;
        int done = (1 << n) - 1;
        solve(0, 0, 0, done);
        return count;
    }
    private void solve(int cols, int diag1, int diag2, int done) {
        if (cols == done) {
            count++;
            return;
        }
        int slots = ~(cols | diag1 | diag2) & done;
        while (slots > 0) {
            int bit = slots & -slots;
            slots -= bit;
            solve(cols | bit, (diag1 | bit) << 1, (diag2 | bit) >> 1, done);
        }
    }
}
