package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix =
               {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        System.out.println(spiralMatrix(matrix));
//        int[][] matrix2 = spiralMatrix2(3);
//        for (int[] row:matrix2){
//            System.out.println(Arrays.toString(row));
//        }
        int[][] matrix3 = spiralMatrix3(5,6,1,4);
        for (int[] row:matrix3){
            System.out.print(Arrays.toString(row));
        }

    }
    public static List<Integer> spiralMatrix(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int top=0;
        int left =0;
        int bottom = matrix.length-1;
        int right =  matrix[0].length-1;
        while (top<=bottom && left<=right){
            //left->rigth
            for (int col = left; col <= right; col++) {
                res.add(matrix[top][col]);
            }
            top++;

            //tot->bottom
            for (int row = top; row <= bottom; row++) {
                res.add(matrix[row][right]);
            }
            right--;

            //right->left
            if(top<=bottom){
                for (int col = right; col >= left ; col--) {
                    res.add(matrix[bottom][col]);
                }
            }
            bottom--;

            //bottom->top
            if(left<=right){
                for (int row = bottom; row >=top ; row--) {
                    res.add(matrix[row][left]);
                }
            }
            left++;
        }
        return res;
    }
    public static int[][] spiralMatrix2(int n){
        int[][] matrix = new int[n][n];
        int left =0;
        int right = n-1;
        int top =0;
        int bottom =n-1;
        int num =1;
        while (top<=bottom && left<=right){
            //left-->right
            for (int col = left; col <=right ; col++) {
                matrix[top][col]=num;
                num++;
            }
            top++;

            //top-->bottom
            for (int row = top; row <=bottom ; row++) {
                matrix[row][right]=num;
                num++;
            }
            right--;

            //right-->left
            if(top<=bottom){
                for (int col = right; col >=left ; col--) {
                    matrix[bottom][col]=num;
                    num++;
                }
                bottom--;
            }

            //bottom--top
            if(left<=right){
                for (int row = bottom; row >=top ; row--) {
                    matrix[row][left]=num;
                    num++;
                }
                left++;
            }
        }
        return matrix;
    }

    public static int[][] spiralMatrix3(int rows,int cols,int rowStart,int colsStart){
        int[][] res = new int[rows*cols][2];
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int r =  rowStart;
        int c = colsStart;
        int index = 0;
        int len =1;
        res[index++]= new int[]{r, c};
        while (index<res.length){
            for (int d = 0; d < 4; d++) {
                for (int step = 0; step < len; step++) {
                    r+=dirs[d][0];
                    c+=dirs[d][1];
                    if(r >= 0 && r < rows && c >= 0 && c < cols){
                        res[index++]=new int[]{r,c};
                        if(index== res.length){
                            return res;
                        }
                    }
                }if (d%2==1){
                    len++;
                }
            }
        }
        return res;
    }
}
