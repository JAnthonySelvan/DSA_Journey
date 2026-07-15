package Recursion.Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,11};
        System.out.println(sortedArray(arr));
    }
    public static boolean sortedArray(int[] arr){
        return helper(arr,0);
    }
    public static boolean helper(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return helper(arr,index+1);
    }
}
