package Graphs;

public class Leetcode_733 {

    static void dfs(int[][] image, int row, int col, int oC, int nC) {

        int rows = image.length;
        int cols = image[0].length;

        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return;
        }

        if (image[row][col] != oC) {
            return;
        }

        image[row][col] = nC;

        
        dfs(image, row - 1, col, oC, nC); // Up
        dfs(image, row + 1, col, oC, nC); // Down
        dfs(image, row, col - 1, oC, nC); // Left
        dfs(image, row, col + 1, oC, nC); // Right
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oC = image[sr][sc];
        if (oC == color) {
            return image;
        }

        dfs(image, sr, sc, oC, color);

        return image;
    }
}

