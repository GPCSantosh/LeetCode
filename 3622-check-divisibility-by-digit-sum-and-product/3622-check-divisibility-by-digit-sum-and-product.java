class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, mul = 1;
        int temp = n;
        while(n != 0){
            int digit = n % 10;
            mul *= digit;
            sum += digit;
            n /= 10;
        }
        if((temp % (sum + mul)) == 0) return true;
        return false;
    }
}