package Recursion.Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subSeq(s,""));
    }
    public static ArrayList<String> subSeq(String s,String p){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = s.charAt(0);
        ArrayList<String> nextRight = subSeq(s.substring(1),p+c);
        ArrayList<String> nextLeft = subSeq(s.substring(1),p);

        nextLeft.addAll(nextRight);
        return nextLeft;

    }
}
