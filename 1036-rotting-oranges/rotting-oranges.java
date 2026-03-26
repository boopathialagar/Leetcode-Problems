class Solution {
    public void dfs(int[][] grid,int i,int j,int[][] timeGrid,int curTime){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || timeGrid[i][j] <=curTime){
            return;
        }
        timeGrid[i][j] = curTime;
        dfs(grid,i+1,j,timeGrid,curTime+1);
        dfs(grid,i-1,j,timeGrid,curTime+1);
        dfs(grid,i,j+1,timeGrid,curTime+1);
        dfs(grid,i,j-1,timeGrid,curTime+1);
    }

    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] timeGrid = new int[row][col];

        for(int i=0;i<row;i++){
            Arrays.fill(timeGrid[i],Integer.MAX_VALUE);
        }

        for(int i =0;i<row;i++){
            for(int j=0; j<col;j++){
                if(grid[i][j]==2){
                    dfs(grid,i,j,timeGrid,0);
                }
            }
        }
        int maxTime =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    if(timeGrid[i][j]==Integer.MAX_VALUE)return -1;
                    maxTime = Math.max(maxTime,timeGrid[i][j]);
                }
            }
        }
        return maxTime;
    }
}