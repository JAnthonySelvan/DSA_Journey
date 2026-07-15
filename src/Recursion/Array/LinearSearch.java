package Recursion.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,1,9,7};
        System.out.println(linearSearch(arr,1));
    }
    public static int linearSearch(int[] arr,int target){
        return helper(arr,target,0);
    }
    public static int helper(int[] arr,int target,int index){
        if(arr[index]==target){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return helper(arr,target,index+1);
    }
}
