package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch_All_Index {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,6,1,9,7};
        System.out.println(findAll(arr,7));
    }
    public static ArrayList<Integer> findAll(int[] arr,int target){
//        return findIndexes(arr,target,0,new ArrayList<Integer>());
        return findIndexes2(arr,target,0);
    }
    public static ArrayList<Integer> findIndexes(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index== arr.length){
            if(list.isEmpty()){
                list.add(-1);
                return list;
            }
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findIndexes(arr,target,index+1,list);
    }

    public static ArrayList<Integer> findIndexes2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansNext = findIndexes2(arr,target,index+1);
        list.addAll(ansNext);
        return list;
    }
}
