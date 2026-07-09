import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // String s1 = "", s2 = "";
        // for(int i = 0 ; i < strs.length-1 ; i++){
        //     // for(int j = 0 ; j < strs[0].length()-1 ; j++){
        //         if(strs[i].equals(strs[i+1])){
        //             s2 = strs[i];
        //             s1.concat(s2);
        //         // }
        //     }
        // }
        // return s1;
        if (strs == null || strs.length == 0) return "";

        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    return strs[0].substring(0, j);
                }
            }
        }

        return strs[0];
    }
}