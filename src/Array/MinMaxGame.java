package Array;

public class MinMaxGame {
    public static void main(String[] args) {
        int[] arr = {3,2};
        System.out.println(maxMin(arr));
    }
    public static int maxMin(int[] arr){
        int i=0;
        int n=arr.length-1;
        boolean min=true;
        int index=0;
        while(n>0){
            if(min){
                if(arr[i]<arr[i+1]){
                    arr[index++]=arr[i];
                    min=false;
                }
                else{
                    arr[index++]=arr[i+1];
                    min=false;
                }
            }
            else{
                if(arr[i]>arr[i+1]){
                    arr[index++]=arr[i];
                    min=true;
                }
                else{
                    arr[index++]=arr[i+1];
                    min=true;
                }
            }
            if (i==n-1){
                n=n/2;
                i=0;
                index=0;
            }
            else{
                i=i+2;
            }
        }
        return arr[0];
    }
}