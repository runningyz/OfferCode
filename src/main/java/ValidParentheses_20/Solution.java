package main.java.ValidParentheses_20;
import java.util.*;

public class Solution {
    public static void main(String args[]){
        String input = "{((()))[]}";
        System.out.println(isValid(input));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //boolean result = true;
        char[] array = s.toCharArray();
        for(char c:array){
            if(c == '}' || c == ']' || c == ')'){
                if(stack.empty()) return false;
                char topE = stack.pop();
                if(!validPair(topE, c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        if(!stack.isEmpty()){
          return false;
        }
        else return true;
    }

    public static boolean validPair(char c1, char c2){
        if((c1 == '(' && c2 == ')') || (c1==')' && c2 == '(')) return true;
        else if((c1 == '[' && c2 == ']') || (c1==']' && c2 == '[')) return true;
        else if((c1 == '{' && c2 == '}') || (c1=='}' && c2 == '{')) return true;
        else return false;
    }
}
