class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int n = s.length();
        if(n==0 || n==1) return n;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int count = 0;
            set.add(s.charAt(i));
            for(int j=i+1;j<n;j++){
                char ch = s.charAt(j);
                if(set.contains(ch)){
                    // count = set.size();
                    break;
                }
                else{
                    set.add(ch);
                }
            }
            max = Math.max(max,set.size());
            set.clear();
        }
        return max;
    }
}