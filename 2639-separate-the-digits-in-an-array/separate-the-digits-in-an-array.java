class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(n>9){
                Stack<Integer> s = new Stack<>();
                while(n != 0){
                    int l = n%10;
                    s.add(l);
                    n = n/10;
                }
                while(!s.isEmpty()){
                    res.add(s.pop());
                }
            }
            else{
                res.add(n);
            }
        }
        
        int[] arr = new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i] = res.get(i);
        }
return arr;
    }
}