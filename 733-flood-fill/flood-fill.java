class Solution {
    public void dfs(int[][] grid, int i, int j, int og, int c){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]!=og){
            return;
        }
        grid[i][j]=c;
        dfs(grid,i+1,j,og,c);
        dfs(grid,i,j+1,og,c);
        dfs(grid,i-1,j,og,c);
        dfs(grid,i,j-1,og,c);

    }
    public int[][] floodFill(int[][] grid, int sr, int sc, int color) {
        int row = grid.length;
        int col = grid[0].length;
        int original_colour = grid[sr][sc];
        if(original_colour==color) return grid;
        dfs(grid,sr,sc,original_colour,color);
        return grid;
    }
}