class Solution {
    public boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n= s.length();
        String result = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i,j+1);
                if(palindrome(sub) && sub.length()>result.length()){
                    result = sub;
                }
            }
        }
        return result;
    }
}