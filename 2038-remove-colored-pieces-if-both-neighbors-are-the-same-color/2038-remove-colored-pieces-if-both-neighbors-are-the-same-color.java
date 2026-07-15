class Solution {
    public boolean winnerOfGame(String s) {
        // int maxi = Integer.MIN_VALUE;
        // int cnt = 1;
        int ali = 0, bob = 0;
        for(int i = 1 ; i < s.length()-1 ; i++){
            if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) == s.charAt(i+1)){
                if(s.charAt(i) == 'A')
                    ali++;
                // cnt++;
                // maxi = Math.max(maxi, cnt);
                else bob++;
            }
            // if(cnt == 3) return true;
        }
        return ali > bob;
    }
}