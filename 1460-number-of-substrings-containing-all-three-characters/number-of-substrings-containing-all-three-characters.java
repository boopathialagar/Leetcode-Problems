class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int n = s.length();
        int seen[] = {-1,-1,-1};
        for(int i=0;i<n;i++){
                seen[s.charAt(i)-'a'] = i;
                count+=1+Math.min(seen[0],Math.min(seen[1],seen[2]));
            
        }
        return count;
    }
}