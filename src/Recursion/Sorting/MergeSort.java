package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,6,4,7,3,9,5};
        System.out.println(Arrays.toString(mergeSortInPlace(arr,0, arr.length)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int[] merged = new int[left.length + right.length];
        int l=0;
        int r=0;
        int i=0;
        while (l< left.length&&r<right.length){
            if (left[l]<right[r]){
                merged[i++]=left[l];
                l++;
            }
            else {
                merged[i++]=right[r];
                r++;
            }
        }
        while (l<left.length){
            merged[i++]=left[l];
            l++;
        }
        while (r<right.length){
            merged[i++]=right[r];
            r++;
        }
        return merged;
    }

    public static int[] mergeSortInPlace(int[] arr,int s,int e){
        if(e-s == 1){
            return new int[]{arr[s]};
        }
        int m=s+(e-s)/2;
        int[] left = mergeSortInPlace(arr, s, m);
        int[] right = mergeSortInPlace(arr, m, e);

        return merge(left, right);
    }
}
