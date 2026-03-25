class Solution {
    public void dfs(int[][] grid,int sr,int sc,int color,int og){
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || grid[sr][sc]!=og){
            return;
        }
        grid[sr][sc] = color;
        dfs(grid,sr+1,sc,color,og);
        dfs(grid,sr,sc+1,color,og);
        dfs(grid,sr-1,sc,color,og);
        dfs(grid,sr,sc-1,color,og);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row = image.length;
        int col = image[0].length;
        int og = image[sr][sc];
        if(og == color)return image;
        dfs(image,sr,sc,color,og);
        return image;
    }
}