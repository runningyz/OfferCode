package main.java.LongestCommonPrefix;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int minimumSize = Integer.MAX_VALUE;
        for(int i = 0;i < strs.length;i++){
            minimumSize = minimumSize<strs[i].length()?minimumSize:strs[i].length();
        }
        String result = "";
        for(int i = 0;i < minimumSize; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0;j < strs.length; j++){
                set.add(strs[j].charAt(i));
            }
            if(set.size() == 1) result += strs[0].charAt(i);
        }
        return result;
    }
    public static void main(String args[]){
        String[] testArray = {"fllow", "flow", "floud", "flr"};
        System.out.println(longestCommonPrefix(testArray));
    }
}

