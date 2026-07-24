package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        System.out.println(queensCount(board,0));
        queensList(board,0,ans);
        System.out.println(ans);
    }
    public static int queensCount(boolean[][] board,int row){
        if(row==board.length){
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queensCount(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    public static void queensList(boolean[][] board,int row,List<List<String>> ans){
        if(row==board.length){
            ans.add(build(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                queensList(board,row+1,ans);
                board[row][col]=false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board,int row,int col){
        for(int i = 0; i < board.length; i++) {
            if (board[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row,col);
        for (int i = 0; i <=maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(board.length-col-1,row);
        for (int i = 0; i <=maxRight ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
    public static List<String> build(boolean[][] board){
        List<String> list = new ArrayList<>();
        for (boolean[] rows:board){
            StringBuilder sb = new StringBuilder();
            for (boolean element:rows){
                sb.append(element?'Q':'.');
            }
            list.add(sb.toString());
        }
        return list;
    }
}
