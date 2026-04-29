class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] profit = new int[n+1];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                profit[0] = nums[0];
            } else if (i == 1) {
                profit[1] = Math.max(nums[1], nums[0]);
            } else {
                profit[i] = Math.max(nums[i] + profit[i - 2], profit[i - 1]);
            }

        }
        return profit[n - 1];
    }
}