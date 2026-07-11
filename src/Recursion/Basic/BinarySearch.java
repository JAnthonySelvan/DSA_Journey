package Recursion.Basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9};
        System.out.println(binarySearch(arr,0,arr.length-1,0));
    }
    public static int binarySearch(int[] arr,int start,int end,int target){
        int mid=start+(end-start)/2;
        if(start<=end){
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                return binarySearch(arr,start,mid-1,target);
            }
            else {
                return binarySearch(arr,mid+1,end,target);
            }
        }
        return -1;

    }
}
