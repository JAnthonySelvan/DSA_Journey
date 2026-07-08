package Sort.CyclicSort;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findMismatch(arr)));
    }
    public static int[] findMismatch(int[] nums){
        int i=0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else {
                i++;
            }
        }
        for (i = 0;  i< nums.length; i++) {
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
