class Solution {
    public int maximumLengthSubstring(String s) {
        int[] counts = new int[26];
        int maxl = 0;
        int left = 0;
        for(int right = 0 ; right < s.length() ; right++){
            char rightchar = s.charAt(right);
            counts[rightchar - 'a']++;
            while(counts[rightchar - 'a'] > 2){
                char leftchar = s.charAt(left);
                counts[leftchar - 'a']--;
                left++;
            }
            maxl = Math.max(maxl, right - left + 1);
        }
        return maxl;
    }
}