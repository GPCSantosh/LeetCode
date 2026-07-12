public class Solution {
    public int maxRotateFunction(int[] A) {
        int n = A.length;
        if (n == 0) {
            return 0;
        }
        int totalSum = 0;
        int currentF = 0;
        for (int i = 0; i < n; i++) {
            totalSum += A[i];
            currentF += i * A[i];
        }
        int maxF = currentF;
        for (int k = 1; k < n; k++) {
            currentF = currentF + totalSum - n * A[n - k];
            maxF = Math.max(maxF, currentF);
        }
        return maxF;
    }
}