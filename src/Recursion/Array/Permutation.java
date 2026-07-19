package Recursion.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        return permutation(nums,0,new ArrayList<>());
    }
    public static List<List<Integer>> permutation(int[] nums,int index,List<Integer> p){
        List<List<Integer>> ans = new ArrayList<>();
        if(index==nums.length){
            ans.add(new ArrayList<>(p));
            return ans;
        }
        int num = nums[index];
        for (int i = 0; i <= p.size(); i++) {
            //to skip duplicates
            if(i>0 && p.get(i-1)==num){
                break;
            }
            List<Integer> temp = new ArrayList<>(p);
            temp.add(i, num);
            ans.addAll(permutation(nums, index + 1, temp));
        }
        return ans;
    }
}
