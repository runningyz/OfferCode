package main.java.AddBinary_67;

import java.util.Stack;

public class AddBinary {
    public String sulution(String a, String b){
        Stack<Integer> res = new Stack<>();
        int pointer1 = a.length() - 1;
        int pointer2 = b.length() - 1;
        int cache = 0;
        while(pointer1 >= 0 && pointer2 >= 0){
            int get1 = Integer.valueOf("" + a.charAt(pointer1--));
            int get2 = Integer.valueOf("" + b.charAt(pointer2--));
            int sum = get1 + get2 + cache;
            switch(sum){
                case 0:{res.push(0);cache = 0;break;}
                case 1:{res.push(1);cache = 0;break;}
                case 2:{res.push(0);cache = 1;break;}
                case 3:{res.push(1);cache = 1;break;}
            }
        }
        String output = "";
        while(pointer1 >= 0){
            int sum = cache + Integer.valueOf("" + a.charAt(pointer1--));
            switch(sum){
                case 0:{res.push(0);cache = 0;break;}
                case 1:{res.push(1);cache = 0;break;}
                case 2:{res.push(0);cache = 1;break;}
                case 3:{res.push(1);cache = 1;break;}
            }
        }
        while(pointer2 >= 0){
            int sum = cache + Integer.valueOf("" + b.charAt(pointer2--));
            switch(sum){
                case 0:{res.push(0);cache = 0;break;}
                case 1:{res.push(1);cache = 0;break;}
                case 2:{res.push(0);cache = 1;break;}
                case 3:{res.push(1);cache = 1;break;}
            }
        }
        if(cache == 1) output += "1";
        while(!res.isEmpty()) output += res.pop();
        return output;
    }
}
