class Solution {
    public long minimumSteps(String s) {
        // int n = s.length();
        // int ones = 0, zero = 0;
        // int maxo = Integer.MIN_VALUE;
        // int maxz = Integer.MIN_VALUE;
        // int maxi = 0;
        // for(int i = 0 ; i < n ; i++){
        //     if(s.charAt(i) == '1'){
        //         ones++;
        //         zero = 0;
        //         maxo = Math.max(maxo, ones);
        //     }
        //     else{
        //         ones = 0;
        //         zero++;
        //         maxz = Math.max(maxz, zero);
        //     }
        // }
        // maxi = Math.max(maxo, maxz);
        // return Math.abs(n-maxi);
        long sum = 0;
        long ones = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                ones++;
            }
            else sum += ones;
        }
        return sum;
    }
}