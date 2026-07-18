package Recursion.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubSet {
    public static void main(String[] args) {
        int[] arr ={1,2,2,2};
        System.out.println(subsetDuplicate(arr));
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
}
