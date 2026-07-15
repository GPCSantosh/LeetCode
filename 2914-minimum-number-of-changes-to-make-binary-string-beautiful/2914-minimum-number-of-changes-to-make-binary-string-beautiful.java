class Solution {
    public int minChanges(String s) {
        // int n = s.length();
        // int cnt = 0;
        // int maxi = Integer.MIN_VALUE;
        // for(int i = 0 ; i < n-1 ; i++){
        //     if(s.charAt(i) != s.charAt(i+1)){
        //         cnt++;
        //         maxi = Math.max(maxi, cnt);
        //     }
        //     // else maxi = 0;
        // }
        // return maxi;
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i+= 2){
            if(s.charAt(i) != s.charAt(i+1)) cnt++;
        }
        return cnt;
    }
}