package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
//        int target = 4;
//        System.out.println(dice("",4));
        System.out.println(countRolls(30,30,500));
    }
    public static List<String> dice(String p,int target){
        List<String> ans = new ArrayList<>();
        if(target==0){
            ans.add(p);
            return ans;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            ans.addAll(dice(p+i,target-i));
        }
        return ans;
    }

    //leetcode 1155
    public static int countRolls(int n,int k,int target){
        if (n == 0) {
            return target == 0 ? 1 : 0;
        }

        if (target < 0) {
            return 0;
        }

        int count = 0;

        for (int i = 1; i <= k; i++) {
            count += countRolls(n - 1, k, target - i);
        }

        return count;
    }
}
