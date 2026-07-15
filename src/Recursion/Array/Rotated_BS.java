package Recursion.Array;

public class Rotated_BS {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,1,2,2,3};
        System.out.println(rotatedBinarySearch(arr,2));
    }
    public static int rotatedBinarySearch(int[] arr,int target){
        return searchIndex(arr,target,0,arr.length-1);
    }
    public static int searchIndex(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]==arr[mid] && arr[mid]==arr[end]){
            return searchIndex(arr,target,start+1,end-1);
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<arr[mid]){
                return searchIndex(arr,target,start,mid-1);
            }
            else {
                return searchIndex(arr,target,mid+1,end);
            }
        }
        else {
            if(target>arr[mid] && target<=arr[end]){
                return searchIndex(arr,target,mid+1,end);
            }
            else {
                return searchIndex(arr,target,start,mid-1);
            }
        }
    }
}
