class Solution {
    List<String> result = new ArrayList<>();
    String[] phone ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
     combination(0,digits,new StringBuilder());
     return result;   
    }

    public void combination(int index,String digits,StringBuilder cur){
        if(cur.length()==digits.length()){
            result.add(cur.toString());
            return;
        }
        String letters = phone[digits.charAt(index)-'0'];
        for(char c:letters.toCharArray()){
            cur.append(c);
            combination(index+1,digits,cur);
            cur.deleteCharAt(cur.length()-1);
        }


    }
}