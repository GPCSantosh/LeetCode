class Solution {
    public String winningPlayer(int x, int y) {
        int sum = 0;
        while(x >= 1 && y >= 4){
            x -= 1;
            y -= 4;
            sum++;
        }
        if((sum & 1) == 1){
            return "Alice";
        }
        return "Bob";
    }
}