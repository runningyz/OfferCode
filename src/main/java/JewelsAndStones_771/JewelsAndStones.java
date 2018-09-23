package JewelsAndStones_771;
public class JewelsAndStones{
    public static void main(String[] args){
        System.out.println(Solution.numJewelsInStones("aA","aAAbbBB"));
    }

}
class Solution {
    public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        for(int i = 0;i<J.length();i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j))
                    sum += 1;
            }
        }
        return sum;
    }
}
