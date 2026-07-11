package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix =
               {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
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
                for (int row = 0; row >=top ; row--) {
                    res.add(matrix[row][left]);
                }
            }
            left++;
        }
        System.out.println(res);
    }
}
