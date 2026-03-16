class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(candidates,target,result,temp,0);
        return result;
    }
    public void backtrack(int[] candidates,int t,List<List<Integer>> result,List<Integer> temp,int index){
        if(t ==0){
            result.add(new ArrayList<Integer> (temp));
            return;
        }
        if(t<0){
            return;
        }
        for(int i =index;i<candidates.length;i++){
            temp.add(candidates[i]);
            backtrack(candidates,t-candidates[i],result,temp,i);
            temp.remove(temp.size()-1);
        }
    }
}