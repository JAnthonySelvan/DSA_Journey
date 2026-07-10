package Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern7(4);
    }

    public static void pattern1(int n){
        //    *
//            * *
//            * * *
//            * * * *
//            * * * * *
        for (int row = 1; row <=n ; row++) {
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
            //* * * *
            //* * *
            //* *
            //*
        for (int row = 1; row <=n ; row++) {
            for (int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
//        1
//        1 2
//        1 2 3
//        1 2 3 4
        for (int row = 1; row <=n ; row++) {
            for (int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
//          *
//          * *
//          * * *
//          * * * *
//          * * *
//          * *
//          *
        for (int row=0;row< 2*n;row++){
            int cols = row<n?row:2*n-row;
            for (int col=0;col<cols;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
//            *
//           * *
//          * * *
//         * * * *
//          * * *
//           * *
//            *
        for (int row = 0; row < 2*n; row++) {
            int cols = row<n?row:2*n-row;
            int space = n-cols;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <cols ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
//          1
//        2 1 2
//      3 2 1 2 3 
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
        for (int i = 0; i < n; i++) {
            int cols = 2*i+1;
            int spaces = (n-1-i)*2;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            int num = i+1;
            for (int j = 0; j < cols; j++) {
              System.out.print(num+" ");
              num=j<(cols/2)?num-1:num+1;
            }
            System.out.println();
        }
    }
    
    public static void pattern7(int n){
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
        int original =n;
        n=n*2-1;
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <n; col++) {
                int element = original-Math.min(Math.min(row,col),Math.min(n-row-1,n-col-1));
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}

