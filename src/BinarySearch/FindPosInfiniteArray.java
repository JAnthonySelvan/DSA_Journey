package BinarySearch;

public class FindPosInfiniteArray {
    public static void main(String[] args) {
            int[] arr={1,5,7,8,10,12,14,17,22,25,28,65};
            int target=12;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
