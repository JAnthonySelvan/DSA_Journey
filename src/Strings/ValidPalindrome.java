package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s= "race a car";
        char[] c= s.toCharArray();
        int left =0;
        int right = c.length-1;
        while (left<right){
            if(c[left]>='A'&&c[left]<='Z'){
                c[left]=(char)(c[left]+32);
            }
            if(c[right]>='A'&&c[right]<='Z'){
                c[right]=(char)(c[right]+32);
            }
            if(!((c[left]>='a'&&c[left]<='z')||(c[left]>='0'&&c[left]<='9'))){
                left++;
            } else if (!((c[right]>='a'&&c[right]<='z')||(c[right]>='0'&&c[right]<='9'))) {
                right--;
            }else {
                if(c[left]!=c[right]){
                    System.out.println("false");
                    return;
                }
                right--;
                left++;
            }
        }
        System.out.println("true");
    }
}
