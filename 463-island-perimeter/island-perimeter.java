class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;

        int height = grid.length;
        int width = grid[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {
                    ans += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        ans -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        ans -= 2;
                    }

                }
            }
        }

        return ans;
    }
}