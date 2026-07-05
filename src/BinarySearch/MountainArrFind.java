package BinarySearch;

public class MountainArrFind {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1,0};
        int index=findIndex(arr);
        System.out.println(binarySearch(arr,index,77));
    }
    public static int findIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
    public static int binarySearch(int[] arr,int index,int target){
        int start=0;
        int end = index;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        start=index;
        end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
