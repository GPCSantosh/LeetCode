class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int[][] pairs = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = 0 ; j < mat[0].length ; j++)
                if(mat[i][j] == 1) sum++;
            pairs[i][0] = sum;
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
        int[] res = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i] = pairs[i][1];
        }
        return res;
    }
}