package Sort.CyclicSort;

import java.util.Arrays;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(findMissing(arr));
    }
    public static int findMissing(int[] nums){
        int i=0;
        while (i< nums.length){
            if (nums[i]>0 && nums[i]<= nums.length){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    int temp = nums[i];
                    nums[i] =  nums[correct];
                    nums[correct]=temp;
                }
                else {
                    i++;
                }
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return 1;
    }
}
