package main.java.test;

public class Solution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int minNumberOfProjects(int num, int projCmptDec, int restDec,
                                   int[] errorScore)
    {
        int sum = 0;
        while(hasNoZero(errorScore)){
            int maxIndex = max(errorScore);
            System.out.println(errorScore[maxIndex]);
            int time;
            if(errorScore[maxIndex]<projCmptDec){
                errorScore[maxIndex] = 0;
                time = 1;
            }
            else{
                time = errorScore[maxIndex]/projCmptDec;
                errorScore[maxIndex] %= projCmptDec;
            }
            for(int i = 0; i < errorScore.length;i++){
                if(i != maxIndex){
                    errorScore[i] = (errorScore[i] - restDec*time)<0?0:errorScore[i] - restDec*time;
                }
            }
        }
        return sum;
    }

    private boolean hasNoZero(int[] errorScore){
        boolean result = false;
        for(int i = 0;i < errorScore.length;i++){
            if(errorScore[i] > 0){
                result = true;
                break;
            }
        }
        return result;
    }

    private int max(int[] array){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int[] test = {9,8,2,5};
        solution.minNumberOfProjects(4,3,1,test);
    }
}
