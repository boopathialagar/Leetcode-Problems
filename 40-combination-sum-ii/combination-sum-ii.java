class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        bkt(candidates,target,result,new ArrayList<>(),0);
        return result;
    }
    public void bkt(int[] candidates,int target,List<List<Integer>> result,List<Integer> temp,int start){
        if(target ==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i] == candidates[i-1])continue;
            if(candidates[i]>target)break;
            temp.add(candidates[i]);
            bkt(candidates,target-candidates[i],result,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}