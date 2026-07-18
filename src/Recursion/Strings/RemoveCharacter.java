package Recursion.Strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        String s = "abcdefghij";
//        remove(s,"");
        System.out.println(remove2(s));
    }
    public static void remove(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = s.charAt(0);
        if(c=='a'){
            remove(s.substring(1),ans);
        }else {
            remove(s.substring(1),ans+c);
        }
    }
    public static String remove2(String s){
        if(s.isEmpty()){
            return "";
        }
        char c = s.charAt(0);
        if(c=='a'){
            return remove2(s.substring(1));
        }
        return c+remove2(s.substring(1));
    }
}
