class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxCap = 0;
        while (l < r) {

            int width = r - l;
            int min = Math.min(height[r], height[l]);
            int capacity = min * width;

            maxCap = Math.max(maxCap, capacity);
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }

        }
        return maxCap;
    }
}