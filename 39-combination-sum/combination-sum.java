class Solution {
    public void backtrack(int target, int arr[],List<List<Integer>> result,List<Integer> temp,int index ){
        if(target ==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i =index;i<arr.length;i++){
            temp.add(arr[i]);
            backtrack(target-arr[i],arr,result,temp,i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(target,candidates,result,new ArrayList<>(),0);
        return result;
    }
}