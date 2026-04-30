class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(board,result,0);
        return result;
    }
    public void solve(char[][] board,List<List<String>> result,int row){
        if(row==board.length){
            List<String> li = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                li.add(new String(board[i]));
            }
             result.add(li);
        }
        for(int col=0;col<board.length;col++){
            if(check(row,col,board)){
                board[row][col] = 'Q';
                solve(board,result,row+1);
                board[row][col] = '.';
            }
        }   
    }

    public boolean check(int r,int c,char[][] board){
        for(int i=0;i<r;i++){
            if(board[i][c]=='Q'){
                return false;
            }
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    if(Math.abs(r-i)==Math.abs(c-j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}