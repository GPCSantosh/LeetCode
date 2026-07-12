class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        s = new String(a1);
        t = new String(a2);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}