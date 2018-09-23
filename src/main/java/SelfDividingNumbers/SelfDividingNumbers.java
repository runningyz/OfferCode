package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args){

    }
}

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int x = left;x<=right;x++){
            if(judgeSelfDividing(x)) list.add(x);
        }
        return list;
    }

    private boolean judgeSelfDividing(int x){
        int[] loc = fetchNumbers(x);
        boolean result = true;
        for(int i = 0;i<loc.length;i++){
            if(loc[i] == 0 || x % loc[i] != 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    private int[] fetchNumbers(int x){
        int cursor = 0;
        int[] loc = new int[5];
        while(x != 0){
            loc[cursor] = (x%getPower(cursor+1))/getPower(cursor);
            x -= loc[cursor]*getPower(cursor);
            cursor++;
        }
        while(cursor < 5){
            loc[cursor++] = -1;
        }
        return loc;
    }

    private int getPower(int num){
        int sum = 1;
        while(num > 0){
            sum *= 10;
            num --;
        }
        return sum;
    }
}
