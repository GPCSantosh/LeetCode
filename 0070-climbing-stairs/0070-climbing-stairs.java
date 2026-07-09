class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int one = 1, two = 1, total = 0;
        for(int i = 2 ; i < n+1 ; i++){
            total = one + two;
            two = one;
            one = total;
        }
        return total;
    }
}