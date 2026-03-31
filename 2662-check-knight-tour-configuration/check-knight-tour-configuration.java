class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0)
            return false;
        return bfs(grid, 0, 0, 1);
    }

    int[][] quartinates = {
            { 2, 1 },
            { 2, -1 },
            { 1, 2 },
            { 1, -2 },
            { -1, 2 },
            { -1, -2 },
            { -2, 1 },
            { -2, -1 }
    };

    boolean bfs(int[][] grid, int i, int j, int cell) {

        for (int[] q : quartinates) {
            int x = q[0];
            int y = q[1];
            int dx = i + x;
            int dy = j + y;
            if ((dx >= 0 && dy >= 0 && dx < grid.length && dy < grid.length) && grid[dx][dy] == cell) {
                return bfs(grid, dx, dy, cell + 1);
            }
        }
        return cell == grid.length * grid.length;
    }
}