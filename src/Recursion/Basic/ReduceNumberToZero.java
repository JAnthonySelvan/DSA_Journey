package Recursion.Basic;

public class ReduceNumberToZero {
    public static void main(String[] args) {
        int n=123;
        System.out.println(steps(n,0));
    }
    public static int steps(int n,int count){
        if(n==0){
            return count;
        }
        if((n&1)==1){
            return (steps(n-1,count+1));
        }
        else {
            return steps(n/2,count+1);
        }
    }
}
