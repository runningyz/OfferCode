package JudgeRouteCircle_657;

public class JudgeRouteCircle {
    public static void main(String[] args){
        System.out.println(Solution.judgeCircle("UDLR"));
    }
}

class Solution{
    public static boolean judgeCircle(String moves) {
        //u d l r
        int[] flags = new int[4];
        for (int x:flags) {
            x = 0;
        }
        for(int i = 0;i<moves.length();i++){
            char cursor = moves.charAt(i);
            if(cursor == 'U') flags[0]++;
            else if(cursor == 'D') flags[1]++;
            else if(cursor == 'L') flags[2]++;
            else if(cursor == 'R') flags[3]++;
        }
        if(flags[1]==flags[0] && flags[3] == flags[2])
            return true;
        else
            return false;
    }
}
