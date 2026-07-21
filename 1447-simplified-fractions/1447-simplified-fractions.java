class Solution {
    public List<String> simplifiedFractions(int n) {
        ArrayList<String> arr = new ArrayList<>();
        // StringBuilder st = new StringBuilder();
        for(int i = 2 ; i <= n ; i++){
            for(int j = 1 ; j <= i-1 ; j++){
                if(gcd(i , j) == 1){
                    // String N = i;
                    // String D = j;
                    // st.append(i + "/" + j);
                    arr.add(j + "/" + i);
                }
            }
        }
        return arr;
    }
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}