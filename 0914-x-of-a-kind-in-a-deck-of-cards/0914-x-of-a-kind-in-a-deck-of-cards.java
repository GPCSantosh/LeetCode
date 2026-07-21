class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int n : deck){
            arr.put(n, arr.getOrDefault(n, 0) + 1);
        }
        int sum = 0;
        for(int n : arr.values()){
            sum = gcd(sum, n);
        }
        return sum > 1;
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