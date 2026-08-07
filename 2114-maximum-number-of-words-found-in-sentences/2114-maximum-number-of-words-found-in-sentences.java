class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxW = 0;
        for(String sentence : sentences){
            String[] words = sentence.split(" ");
            if(words.length > maxW) maxW = words.length;
        }
        return maxW;
    }
}