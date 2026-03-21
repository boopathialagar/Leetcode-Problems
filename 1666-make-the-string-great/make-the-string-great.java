class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
       
        int i = 0;
        while( i<s.length()){
            if( !st.isEmpty() && Math.abs(s.charAt(i)-st.peek())==32){
                st.pop();
                i++;
            }
            else{
                st.push(s.charAt(i));
                i++;
            }
        }


        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        return result.toString();
    }

}