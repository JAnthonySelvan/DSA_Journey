package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5,-6};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}
