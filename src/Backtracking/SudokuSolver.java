package Backtracking;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
//        char[][] board = {
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        };
//        solve(board);
//        for (char[] rows:board){
//            System.out.println(Arrays.toString(rows));
//        }
        char[][] board1 = {
                {'.', '8', '7', '6', '5', '4', '3', '2', '1'},
                {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(validSoduku(board1));


    }
    public static boolean solve(char[][] board){
        int n = board.length;
        int r = -1;
        int c =-1;

        boolean emptyLeft = true;

        //Chect Every Rows & Cols
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]=='.'){
                    r=i;
                    c=j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft){
                break;
            }
        }

        if (emptyLeft){
            return true;
        }

        for (char num = '1'; num <='9' ; num++) {
            if(isSafe(board,r,c,num)){
                board[r][c] = num;
                if (solve(board)){
                    return true;
                }
                board[r][c]='.';
            }
        }
        return false;
    }

    public static boolean validSoduku(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]!='.'){
                    char num = board[i][j];
                    board[i][j] = '.';
                    if(!isSafe(board,i,j,num)){
                        return false;
                    }
                    board[i][j]=num;
                }
            }
        }
        return true;
    }
    public static boolean isSafe(char[][] board,int row,int col,char num){
        //check row
        for (int i=0;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
        }

        //check col
        for (int i=0;i<9;i++){
            if(board[i][col]==num){
                return false;
            }
        }

        //check 3x3 matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

}
