package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(sortedSearch(arr,5)));
    }
    public static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid]<target) {
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] sortedSearch(int[][] matrix,int target){
        int row= matrix.length;
        int col= matrix[0].length;
        if(col==0){
            return new int[]{-1,-1};
        }
        if(row==1){
            return binarySearch(matrix,0,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;
        while (rStart<(rEnd-1)){
            int rMid = rStart+(rEnd-rStart)/2;
            if(target==matrix[rMid][cMid]){
                return new int[]{rMid,cMid};
            } else if (target>matrix[rMid][cMid]) {
                rStart=rMid;
            }else {
                rEnd=rMid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]){
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }else {
            return binarySearch(matrix,rStart+1,cMid+1,col-1,target);
        }
    }
}
