class Solution {
    public int minimumLength(String s) {
        // HashMap<Character, Integer> arr = new HashMap<>();
        // int n = s.length();
        // for(int i = 0 ; i < n ; i++){
        //     arr.put(s.charAt(i), arr.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // int len = 0;
        // for(int cnt : arr.values()){
        //     if(cnt % 2 == 1) len++;
        //     else len += 2;
        // }
        // return len;
        int[] counts = new int[26];
        for(char c : s.toCharArray()){
            counts[c - 'a']++;
        }
        int len = 0;
        for(int cnt : counts){
            if(cnt > 0){
                if(cnt % 2 == 1) len++;
                else len += 2;
            }
        }
        return len;
    }
}