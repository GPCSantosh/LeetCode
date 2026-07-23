import java.util.*;
import java.util.Collections;
class Solution {
    public int largestInteger(int num) {
        String str = Integer.toString(num);        
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                evens.add(digit);
            } else {
                odds.add(digit);
            }
        }
        Collections.sort(evens, Collections.reverseOrder());
        Collections.sort(odds, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        int evenIndex = 0;
        int oddIndex = 0;      
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                result.append(evens.get(evenIndex++));
            } else {
                result.append(odds.get(oddIndex++));
            }
        }        
        return Integer.parseInt(result.toString());
    }
}