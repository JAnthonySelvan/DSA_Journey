package Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,6,8,1,3,4,8,2,4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        return helper(arr,1,arr.length,0,false);
    }
    public static int[] helper(int[] arr,int index,int last,int time,boolean swapped){
        if(time== arr.length){
            return arr;
        }
        if(index==last){
            if(swapped){
                return helper(arr,1,last-1,time+1,false);
            }
            return arr;
        }
        if (arr[index]<arr[index-1]){
//            System.out.println(arr[index]);
            int temp  = arr[index];
            arr[index]=arr[index-1];
            arr[index-1]=temp;
            swapped=true;
            return helper(arr,index+1,last,time,swapped);
        }
        return helper(arr,index+1,last,time,swapped);
    }
}
