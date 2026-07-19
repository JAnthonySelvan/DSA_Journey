package Recursion.Strings;

import java.util.ArrayList;

public class Perumutation {
    public static void main(String[] args) {
        String s = "bbc";
        System.out.println(perumutation(s,""));
    }
    public static void perumutation1(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            perumutation1(up.substring(1),f+c+s);
        }
    }

    public static ArrayList<String> perumutation(String up,String p){
        ArrayList<String> ans = new ArrayList<>();
        if (up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char c = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            //to skip duplicates
            if(i>0 && c==p.charAt(i-1)){
                break;
            }
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(perumutation(up.substring(1),f+c+s));
        }
        return ans;
    }
}
