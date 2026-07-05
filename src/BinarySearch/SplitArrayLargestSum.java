package BinarySearch;
//Example 1:
//
//Input: nums = [7,2,5,10,8], k = 2
//Output: 18
//Explanation: There are four ways to split nums into two subarrays.
//The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
//Example 2:
//
//Input: nums = [1,2,3,4,5], k = 2
//Output: 9
//Explanation: There are four ways to split nums into two subarrays.
//The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            if(start<nums[i]){
                start=nums[i];
            }
            end+=nums[i];
        }
        while (start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int num:nums){
                if(num+sum>mid){
                    sum=num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        System.out.println(end);
    }
}
