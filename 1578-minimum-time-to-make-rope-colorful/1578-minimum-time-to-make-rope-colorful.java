class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int n = colors.length();        
        int i = 0;
        while (i < n) {
            char currentColor = colors.charAt(i);
            int groupSum = 0;
            int groupMax = 0;
            while (i < n && colors.charAt(i) == currentColor) {
                groupSum += neededTime[i];
                groupMax = Math.max(groupMax, neededTime[i]);
                i++;
            }
            totalTime += (groupSum - groupMax);
        }        
        return totalTime;
    }
}