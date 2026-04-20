class Solution {
    public List<String> letterCombinations(String digits) {
        String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        bk(result,phone,new StringBuilder(),0,digits);
        return result;
    
    }

    void bk(List<String> result,String[] phone,StringBuilder cur,int index,String digits){
        if(index == digits.length()){
            result.add(cur.toString());
            return;
        }
        String letters = phone[digits.charAt(index)-'0'];

        for(char ch:letters.toCharArray()){
            cur.append(ch);
            bk(result,phone,cur,index+1,digits);
            cur.deleteCharAt(cur.length()-1);
        }
    }

}
