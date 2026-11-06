class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'R') cnt++;
            else cnt--;
            if(cnt == 0) count++;
        }
        return count;
    }
}