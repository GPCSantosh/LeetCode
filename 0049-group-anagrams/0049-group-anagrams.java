class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(String word : strs){
            char[] sort = word.toCharArray();
            Arrays.sort(sort);
            String key = new String(sort);
            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(word);
        }
        // ArrayList<ArrayList<String>> result = new ArrayList<>(groups.values());
        return new ArrayList<>(groups.values());
    }
}