class Solution {
    boolean ispalindrome(String s,int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
       if(!ispalindrome(s,0, s.length()-1)){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return ispalindrome(s,left+1, right) || ispalindrome(s,left, right-1) ;
            }
            left++;
            right--;            
        }
        return false;
    }
    return true;
}
}