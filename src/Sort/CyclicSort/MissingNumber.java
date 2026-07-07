package Sort.CyclicSort;
//https://leetcode.com/problems/missing-number/description/

//Input: nums = [3,0,1]
//Output: 2

//Input: nums = [0,1]
//Output: 2
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(findMissingNumber(nums));
    }
    public static int findMissingNumber(int[] nums){
        int i=0;
        while (i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
