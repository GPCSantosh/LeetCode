class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] arr = new char[n];
        int top = -1;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                arr[++top] = ch;
            }
            else{
                if(top < 0) return false;
                else{
                    char te = arr[top--];
                    if((ch == ')' && te != '(') ||
                    (ch == ']' && te != '[') ||
                    (ch == '}' && te != '{')){
                        return false;
                    }
                }
            }
        }
        return top == -1;
    }
}