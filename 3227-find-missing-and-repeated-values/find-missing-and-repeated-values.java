class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int result[] = new int[2];
        int len = grid.length;
        int arr[] = new int[len*len+1];

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                arr[grid[i][j]] +=1;
            }
        }
        // for(int i=0;i<len)
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                result[0] = i;
            }
            if(arr[i]==0){
                result[1] = i;
            }
        }

        
        
        return result;
    }
}