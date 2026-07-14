package Recursion.Basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=52;
        System.out.println(reverse2(n));
    }
    static int rev=0;
    public static int reverse1(int n){
        if(n==0){
            return rev;
        }
        int r=n%10;
        rev = rev*10+r;
        return reverse1(n/10);
    }

    public static int reverse2(int n){
        int digits =(int)(Math.log10(n)+1);
        if(n%10==n){
            return n;
        }
        return (int) ((n%10)*Math.pow(10,digits-1)+reverse2(n/10));
    }
}
