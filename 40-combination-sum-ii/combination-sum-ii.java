class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,result,temp,target,0); 
        return result;
    }

    public void backtrack(int[] candidates,List<List<Integer>> result, List<Integer> temp,int target,int index){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            temp.add(candidates[i]);
            backtrack(candidates,result,temp,target-candidates[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}

