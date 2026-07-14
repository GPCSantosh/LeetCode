class Solution {
    public String breakPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        if(n <= 1){
            return "";
        }
        for(int i = 0 ; i < n/2 ; i++){
            if(sb.charAt(i) != 'a'){
                sb.setCharAt(i, 'a');
                return sb.toString();
            }
        }
        sb.setCharAt(n-1, 'b');
        return sb.toString();
    }
}