package main.java.Sqrt_69;

public class Sqrt {
    public int solution(int x){
        if(x == 0) return 0;
        int left = 1;
        int right = x;
        while(true){
            int mid = (left + right) / 2;
            if(mid > x/mid) right = mid -1; //此处不用mid*mid<x作为条件原因是,如果mid特别大,乘积超出int范围,则会变窄处理,只保留低32位 会造成死循环
            else{
                if(mid+1 > x/(mid+1)) return mid;
                left = mid + 1;
            }
        }
    }
}
