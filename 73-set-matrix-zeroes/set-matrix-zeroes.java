class Solution {
    public void setZeroes(int[][] matrix) {
        int len = matrix.length;
        int[] row = new int[len];
        int[] col = new int[matrix[0].length];

        for(int i=0;i<len;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i] == 1 ){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<len;j++){
                if(col[i]==1){
                    matrix[j][i]=0;
                }
            }
        }

    }
}