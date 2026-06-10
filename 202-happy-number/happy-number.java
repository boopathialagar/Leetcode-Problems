class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int num = 0;
            while(n != 0){
                int last = n%10;
                num = num + (last*last);
                n = n/10;
            }
            n = num;

            if(num == 1) return true;
        } 
        return false;
    }
}