class Solution {
    public int fib(int n) {
        int f = 0;
        int s = 1;
        int result = 0;
        if (n == 0) {
            return f;
        } else if (n == 1) {
            return s;
        }
        for (int i = 2; i <= n; i++) {
            int temp = s + f;
            f = s;
            s = temp;
            result = temp;
        }
        return result;
    }
}