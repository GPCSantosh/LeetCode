class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length;
        for(int i = 0 ; i < n ; i++){
            if(s[i].equals("C")){
                st.pop();
            }
            else if(s[i].equals("D")){
                int t = st.peek() * 2;
                st.push(t);
            }
            else if(s[i].equals("+")){
                int t1 = st.pop();
                int t2 = st.pop();
                int t3 = t1+t2;
                st.push(t2);
                st.push(t1);
                st.push(t3);
            }
            else{
                st.push(Integer.parseInt(s[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}