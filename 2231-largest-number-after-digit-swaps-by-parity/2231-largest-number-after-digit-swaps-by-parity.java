import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int largestInteger(int num) {
        String str = Integer.toString(num);
        PriorityQueue<Integer> evens = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odds = new PriorityQueue<>(Collections.reverseOrder());
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                evens.offer(digit);
            } else {
                odds.offer(digit);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                result.append(evens.poll());
            } else {
                result.append(odds.poll());
            }
        }        
        return Integer.parseInt(result.toString());
    }
}