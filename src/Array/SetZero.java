package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/set-matrix-zeroes/description/?envType=problem-list-v2&envId=array
public class SetZero {
    public static void main(String[] args) {
        List<List<Integer>> index = new ArrayList<>();
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    index.add(List.of(i,j));
                }
            }
        }
        for (int i = 0; i < index.size(); i++) {
            int row = index.get(i).get(0);
            int col = index.get(i).get(1);
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][col]=0;
            }
            for (int c=0;c<matrix[0].length;c++){
                matrix[row][c]=0;
            }
        }
        for (int[] m:matrix){
            System.out.println(Arrays.toString(m));
        }
    }
}
