class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;        
        for (int[] row : image) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                if (row[left] == row[right]) {
                    int newValue = row[left] ^ 1; 
                    row[left] = newValue;
                    row[right] = newValue;
                }
                left++;
                right--;
            }
        }        
        return image;
    }
}
