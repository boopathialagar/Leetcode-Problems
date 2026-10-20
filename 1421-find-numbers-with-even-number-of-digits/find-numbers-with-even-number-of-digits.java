class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums){
            int len = String.valueOf(i).length();
            if( len % 2==0){
                count++;
            }
        }
        return count;
    }
}