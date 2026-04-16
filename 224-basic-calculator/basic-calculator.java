class Solution {
    public int calculate(String s) {
        int result = 0;
        int sign =1;
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int num =0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num = num*10 +(s.charAt(i)-'0');
                    i++;
                }
                i--;
                result = result+(sign*num);
            }
            else if(c == '+') sign = 1;
            else if(c=='-') sign = -1;
            else if(c == '('){
                st.push(result);
                st.push(sign);
                result= 0;
                sign = 1;
            }
            else if(c == ')'){
                result = result * st.pop(); 
                result = result + st.pop();
            }
        }
        return result;
    }
}