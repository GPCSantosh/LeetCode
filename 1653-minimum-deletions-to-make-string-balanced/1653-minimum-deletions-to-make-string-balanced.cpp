class Solution {
public:
    int minimumDeletions(string s) {
        int b_count = 0;
        int deletions = 0;
        for (char ch : s) {
            if (ch == 'b') {
                b_count++;
            } else {
                deletions = std::min(deletions + 1, b_count);
            }
        }
        return deletions;
    }
};