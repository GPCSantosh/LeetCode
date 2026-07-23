import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int answer = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        PriorityQueue<Integer>[] queues = new PriorityQueue[rows];
        for (int i = 0; i < rows; i++) {
            queues[i] = new PriorityQueue<>(Collections.reverseOrder());
            for (int val : grid[i]) {
                queues[i].offer(val);
            }
        }
        for (int c = 0; c < cols; c++) {
            int currentMax = 0;
            for (int r = 0; r < rows; r++) {
                currentMax = Math.max(currentMax, queues[r].poll());
            }
            answer += currentMax;
        }        
        return answer;
    }
}