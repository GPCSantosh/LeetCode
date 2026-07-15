class Solution {
    public int partitionString(String s) {
        // int maxi = Integer.MIN_VALUE;
        // HashMap<Character, Integer> arr = new HashMap<>();
        // char[] ar1 = s.toCharArray();
        // for(char ch : ar1){
        //     arr.put(ch, arr.getOrDefault(ch, 0) + 1);
        // }
        // for(int freq : arr.values()){
        //     maxi = Math.max(maxi, freq);
        // }
        // return maxi;
        int par = 0;
        int i = 0;
        while(i < s.length()){
            HashSet<Character> hash = new HashSet<>();
            while(i < s.length() && !hash.contains(s.charAt(i))){
                hash.add(s.charAt(i));
                i++;
            }
            par++;
        }
        return par;
    }
}