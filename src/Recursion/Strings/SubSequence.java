package Recursion.Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String s = "bbc";
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

        int i=0;
        //for skip duplicates
        while (i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
            i++;
        }

        ArrayList<String> nextLeft = subSeq(s.substring(i+1),p);
        nextLeft.addAll(nextRight);
        return nextLeft;

    }
}
