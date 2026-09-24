class Solution {
    public long rev(long x){
        long res = 0;
        while (x != 0){
            long last = x %10;
            res = (res *10) +last;
            x = x /10;
        }
        return res;
    }

    public int reverse(int x) {
        if (x > 0){
            long res = rev(x);
            if(res > Integer.MAX_VALUE){
                return 0;
            }
            return (int)res;
        }
        else {
            long y = (long)x;
            long res = rev(Math.abs(y));
            if (res > Integer.MAX_VALUE){
                return 0;
            }
            return (int)-res;
        }
    }
}