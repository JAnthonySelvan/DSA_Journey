package Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,4,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr){
        return helper(arr,arr.length-1);
    }
    public static int[] helper(int[] arr,int last){
        if(last<0){
            return arr;
        }
        int maxIndex = findMaxIndex(arr,0,1,last);
        int temp = arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
        return helper(arr,last-1);
    }
    public static int findMaxIndex(int[] arr,int max,int index,int last){
        if (index>last){
            return max;
        }
        if(arr[index]>arr[max]){
            max=index;
            return findMaxIndex(arr,max,index+1,last);
        }
        return findMaxIndex(arr,max,index+1,last);
    }
}
