package main.java.ImplementStr_28;

public class ImplementStr {
    public int solution(String haystack, String needle){
        if(needle.length() == 0) return 0;
        if(haystack.length() == 0) return -1;
        int res = -1;
        for(int i = 0;i < haystack.length() - needle.length() + 1;i++){
            if(needle.equals(haystack.substring(i,needle.length()+i))) return i;
        }
        return res;
    }
}
