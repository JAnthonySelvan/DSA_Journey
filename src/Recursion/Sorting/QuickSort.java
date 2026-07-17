package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        System.out.println(Arrays.toString(quickSort(arr)));
    }
    public static int[] quickSort(int[] arr){
        return sort(arr,0,arr.length-1);
    }
    public static int[] sort(int[] arr,int low,int high){
        if(low>=high){
            return arr;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot = arr[m];
        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);

        return arr;
    }
}
