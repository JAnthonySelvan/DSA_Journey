package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

//LeetCode-17: Letter Combinations of a Phone Number
public class LetterCombinations {
    public static void main(String[] args) {
        String s= "23";
        System.out.println(letterCombinations(s));
    }
    //It won't works for LeetCode
    public static List<String> letterCombination(String p,String up){
        List<String> ans = new ArrayList<>();
        if(up.isEmpty()){
           ans.add(p);
           return ans;
        }

        int digit = (int) up.charAt(0)-'0'-1;
        System.out.println(digit);

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char c = (char)('a'+i);
            ans.addAll(letterCombination(p+c,up.substring(1)));
        }
        return ans;
    }
    //It Works for LeetCode
    public static List<String> letterCombinations(String digits){
        String[] map =  {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };
        return helper("",digits,map);
    }
    public static List<String> helper(String p,String up,String[] map){
        List<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        int digit = (int) up.charAt(0)-'0';
        String letters = map[digit];
        for (char c: letters.toCharArray()){
            ans.addAll(helper(p+c,up.substring(1),map));
        }
        return ans;
    }
}
