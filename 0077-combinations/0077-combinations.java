class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> arr = new ArrayList<>();
        track(1, n, k, new ArrayList<>(), arr);
        return arr;
    }
    private void track(int s, int n, int k, List<Integer> cur, List<List<Integer>> res){
        if(cur.size() == k){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = s ; i <= n - (k - cur.size()) +1 ; i++){
            cur.add(i);
            track(i+1, n, k, cur, res);
            cur.remove(cur.size() -1);
        }
    }
}