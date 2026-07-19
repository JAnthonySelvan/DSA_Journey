package Recursion.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubSet {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3};
        System.out.println(subsetDuplicate(arr));
        System.out.println(subsetRegression(arr,0,new ArrayList<>()));
    }
    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr){
            int n= outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internel = new ArrayList<>(outer.get(i));
                internel.add(num);
                outer.add(internel);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;

            // If current and previous element are same
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            System.out.println(start);
            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subsetRegression(int[] nums,int index,List<Integer> p){
        List<List<Integer>> ans = new ArrayList<>();
        if(index==nums.length){
            ans.add(new ArrayList<>(p));
            return ans;
        }
        int num=nums[index];
        List<Integer> include = new ArrayList<>(p);
        include.add(num);
        ans.addAll(subsetRegression(nums,index+1,include));

        //to skip duplicates
        while (index+1<nums.length && nums[index+1]==nums[index]){
            index++;
        }
        ans.addAll(subsetRegression(nums,index+1,p));

        return ans;
    }
}
