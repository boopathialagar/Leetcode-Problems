import java.util.*;

class Solution {

    public boolean isValid(String s) {
        int len = s.length();
        if(len%2!=0){
            return false;
        }else{

        Stack<Character> stack = new Stack<>();
        int size =0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
                size++;
        
            }
            else{
             if( (size != 0) &&(
                (')' == s.charAt(i) && stack.peek()=='(')
                || ('}' == s.charAt(i) && stack.peek() == '{')
                || (']' == s.charAt(i)) && stack.peek() == '[')
                ){
                    stack.pop();
                    size--;
                }else{
                    return false;
                }
            }
            }
System.out.print(size);
            if(size ==0){
                return true;
            }
            else{
                return false;
            }

        }
        
    }
}