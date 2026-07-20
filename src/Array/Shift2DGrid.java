package Array;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {
        int k = 1;
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        List<List<Integer>> ans = new ArrayList<>();
        int  rows = grid.length;
        int cols = grid[0].length;
        int total = rows*cols;
        k%=total;
        for (int i = 0; i < rows ; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(grid[i][j]);
            }
            ans.add(row);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i*cols+j;
                int newIndex = (index+k)%total;
                int newRow = newIndex/cols;
                int newCol = newIndex%cols;
                ans.get(newRow).set(newCol,grid[i][j]);
            }
        }
        System.out.println(ans);
    }
}
