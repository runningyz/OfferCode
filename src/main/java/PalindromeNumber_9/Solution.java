package PalindromeNumber_9;

public class Solution {
    public static void main(String args[])
    {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x){
        String numberString = String.valueOf(x);
        int start = 0;
        int end = numberString.length()-1;
        while(start != end && start < end){
            if(numberString.charAt(start) != numberString.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
