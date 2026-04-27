class Solution {
    public List<String> letterCombinations(String digits) {
        String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        combination(result,phone,0,new StringBuilder(),digits);
        return result;
    }

    public void combination(List<String> result,String[] phone,int index,StringBuilder cur,String digits){
        if(cur.length() == digits.length()){
            result.add(cur.toString());
            return;
        }
        String letters = phone[digits.charAt(index)-'0'];

        for(char c:letters.toCharArray()){
            cur.append(c);
            combination(result,phone,index+1,cur,digits);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}