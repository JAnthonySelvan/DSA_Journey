package Sort.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingAll {
//    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr1 = {1,1};
        System.out.println(findMissing(arr));
    }
    public static List<Integer> findMissing(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (i = 0;  i<arr.length ; i++) {
            if(arr[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
