class Solution {
    List<String> result = new ArrayList<>();
    String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public List<String> letterCombinations(String digits) {  
        combination(0,new StringBuilder(),digits);
        return result;
    }

    public void combination(int index,StringBuilder cur,String digits){
        if(cur.length() == digits.length()){
            result.add(cur.toString());
            return;
        }
        String letters = phone[digits.charAt(index)-'0'];

        for(char c:letters.toCharArray()){
            cur.append(c);
            combination(index+1,cur,digits);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}