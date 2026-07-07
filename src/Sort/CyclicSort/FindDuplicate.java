package Sort.CyclicSort;
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums){
        int i=0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else {
                i++;
            }
        }
        for (i = 0;  i<nums.length ; i++) {
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;
    }
}
