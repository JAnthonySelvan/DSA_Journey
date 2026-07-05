package BinarySearch;

public class RotatedArrMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start=mid+1;
            } else if (arr[mid]<arr[end]) {
                end=mid;
            }else {
                end--;
            }
        }
        System.out.println(start);
    }

    public static class RowColSorted {
    }
}
