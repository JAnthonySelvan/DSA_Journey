package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {-6,3,9,8,-111,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = findMax(arr,0,last);
            int temp = arr[maxIndex];
            arr[maxIndex]=arr[last];
            arr[last]=temp;
        }
        return arr;
    }
    public static int findMax(int[] arr,int start,int last){
        int maxIndex=start;
        for (int i = 1; i <=last ; i++) {
            if (arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
