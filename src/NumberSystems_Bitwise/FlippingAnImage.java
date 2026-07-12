package NumberSystems_Bitwise;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for (int[] img:image){
            for (int i = 0,j=img.length-1; i <=j ; i++,j--) {
                int temp= img[i]^1;
                img[i] =img[j]^1;
                img[j]=temp;
            }
        }
        for (int[] img:image) {
            System.out.println(Arrays.toString(img));
        }
        

    }
}
