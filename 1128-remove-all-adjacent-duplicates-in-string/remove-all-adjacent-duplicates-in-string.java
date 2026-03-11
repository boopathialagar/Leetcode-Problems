class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i =1; i<s.length();i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && c==stack.peek()){
                    stack.pop();                
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            char c =stack.pop();
            result = result.append(c);
        }
        return result.reverse().toString();
    }
}