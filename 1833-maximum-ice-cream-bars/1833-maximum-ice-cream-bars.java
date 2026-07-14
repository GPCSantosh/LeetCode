class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        // int n = costs.length;
        // int i = 1, sum = costs[0];
        int bars = 0;
        for(int n : costs){
            if(n <= coins){
                bars++;
                coins -= n;
            }
        }
        return bars;
    }
}