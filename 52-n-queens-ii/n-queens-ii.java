class Solution {
    int count=0;
    public int totalNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i],'.');
        }
        solve(board,0,result);
        return count;
    }

    public void solve(char[][] board,int row,List<List<String>> result){
        
        if(row == board.length){
            List<String> list = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                list.add(new String(board[i]));
            }
            count++;
            result.add(list);
        }
        for(int col=0;col<board.length;col++){
            if(check(board,row,col)){
                board[row][col] = 'Q';
                solve(board,row+1,result);
                board[row][col]='.';
            }
        }
    }
    public boolean check(char[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    if(Math.abs(i-row)==Math.abs(j-col)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}