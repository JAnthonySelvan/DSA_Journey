package BinarySearch;

import java.util.Arrays;

public class SearchIndex {
    public static int findindex(int[] arr,int target,boolean findStart){
        int start=0;
        int end= arr.length-1;
        int mid=0;
        int ans=-1;
        while (start<=end){
            mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                ans=mid;
                if(findStart){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        int[] ans={-1,-1};
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int start = findindex(nums,target,true);
        int end= findindex(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        System.out.println(Arrays.toString(ans));
    }
}
