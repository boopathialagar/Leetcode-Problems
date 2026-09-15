class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(numbers[0],0);
        for(int i=1;i<numbers.length;i++){
            int compliment = target - numbers[i];
            if (hm.containsKey(compliment)){
                return new int[]{hm.get(compliment)+1,i+1};
            }
            else{
                hm.put(numbers[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}