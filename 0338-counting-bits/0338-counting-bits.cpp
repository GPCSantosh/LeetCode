class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> ans;
        ans.push_back(0);
        for(int i = 1; i <= n ; i++){
            int noofBits = log2(i);
            int currRange = pow(2, noofBits);
            ans.push_back(1 + ans[i- currRange]);
        }
        return ans;
    }
};