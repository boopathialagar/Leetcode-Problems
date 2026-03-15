class Solution {
    public boolean isAnagram(String s, String t) {
        int s_arr[] = new int[26];
        int t_arr[] = new int[26];
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            int index = c-'a';
            s_arr[index]++;
        }
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            int index = c-'a';
            t_arr[index]++;
        }
        for(int i =0;i<26;i++){
            if(t_arr[i]!=s_arr[i])return false;
        }
        return true;
    }
}