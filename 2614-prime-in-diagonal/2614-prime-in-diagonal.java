class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            arr.add(nums[i][i]);
        }
        for(int i = 0 ; i < n ; i++){
            arr.add(nums[i][n-i-1]);
        }
        arr.sort(null);
        for(int i = arr.size()-1 ; i >= 0 ; i--){
            if(isPrime(arr.get(i))) return arr.get(i);
        }
        return 0;
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}