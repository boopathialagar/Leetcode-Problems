class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix.length ==0)return false;
        // if(matrix.length==1){
        //     for(int i=0;i<matrix[0].length;i++){
        //         if(matrix[0][i]==target)return true;
                
        //     }
        //     return false;
        // }
        int position = -1;
        for(int i=0;i<matrix.length;i++){
            if( (matrix[i][0]<=target)){
                position=i;
            }
            else{
                break;
            }
        }
        if(position == -1)return false;
        for(int i=0;i<matrix[position].length;i++){
            if(target == matrix[position][i]){
                return true;
            }
        }
        return false;
    }
}