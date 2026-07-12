package NumberSystems_Bitwise;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,6,8,6,7,8};
        int unique =0;
        for(int num: nums){
            unique^=num;
        }
        System.out.println(unique);
    }

}
