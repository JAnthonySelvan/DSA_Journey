package BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {3,4,5,0,1,2};
        int pivot = findPivot(nums);
        System.out.println(pivot);
        int target =0;
        if (pivot==-1){
            System.out.println(binarySearch(nums,target,0, nums.length-1));
            return;
        }
        if(target==nums[pivot]){
            System.out.println(pivot);
            return;
        }
        if(target>=nums[0]){
            System.out.println(binarySearch(nums,target,0,pivot-1));
            return;
        }else {
            System.out.println(binarySearch(nums,target,pivot+1,nums.length-1));
            return;
        }

    }
    public static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
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

        return -1;
    }
}
