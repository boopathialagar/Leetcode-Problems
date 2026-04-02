class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] picked = new boolean[nums.length];
        helper(nums,result,new ArrayList<>(),picked);
        return result;
    }
    public void helper(int[] nums,List<List<Integer>> result,List<Integer> temp,boolean[] picked){
        if(temp.size() ==nums.length ){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(picked[i])continue;
            temp.add(nums[i]);
            picked[i] = true;
            helper(nums,result,temp,picked);
            temp.remove(temp.size()-1);
            picked[i] = false;
        }
    }
}