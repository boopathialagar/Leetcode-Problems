class Solution {
    private int findGcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findGcd(n2, n1 % n2);
    }

    public int minOperations(int[] nums, int[] numsDivide) {
        int num1 = numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            num1 = findGcd(num1, numsDivide[i]);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (num1 % nums[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}