package NumberSystems_Bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=3;
        boolean pow = (n&(n-1))==0;
        if(pow){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
