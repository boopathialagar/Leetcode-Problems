class Solution {
    private void dfs(int i,int j,int[][] grid,int[][] time,int day){
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || grid[i][j]==0 || time[i][j]<=day){
            return;
        }
        time[i][j] = day;
        dfs(i+1,j,grid,time,day+1);
        dfs(i-1,j,grid,time,day+1);
        dfs(i,j+1,grid,time,day+1);
        dfs(i,j-1,grid,time,day+1);
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] time = new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(time[i],Integer.MAX_VALUE);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    dfs(i,j,grid,time,0);
                }
            }
        }

        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(time[i][j] == Integer.MAX_VALUE){
                        return -1;
                    }
                    else{
                        max = Math.max(max,time[i][j]);
                    }
                } 
            }
        }
        return max;
        

    }
}