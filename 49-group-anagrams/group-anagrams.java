class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }

        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String , List<String>> m : map.entrySet()){
            result.add(m.getValue());
        }
        
        return result;
        }
}