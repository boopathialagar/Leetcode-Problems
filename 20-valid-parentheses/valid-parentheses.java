import java.util.*;

class Solution {

    public boolean isValid(String s) {
        // int len = s.length();
        // if(len%2!=0){
        //     return false;
        // }

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c =='['){
                stack.push(s.charAt(i));
            }
            else{   
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((')'==c && top=='(') || ('}'==c && top=='{') || (']'==c && top=='[')){
                    stack.pop();
                }else{
                    return false;
                }
            }
            }
            return stack.isEmpty();
        
    }
}