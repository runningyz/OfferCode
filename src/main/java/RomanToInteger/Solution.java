package main.java.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int remoanToInt(String s){
        Map<Character,Integer> map = new HashMap<>();
        int lastValue = 0;
        int value;
        int sum = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] array = s.toCharArray();
        for(int i = 0;i < array.length; i++){
            value = map.get(array[i]);
            if(value > lastValue){
                sum = sum - 2*lastValue + value;
            }
            else{
                sum += value;
            }
            lastValue = value;
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.println(remoanToInt("IV"));
    }
}
