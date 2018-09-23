class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevLen = 0;
        int currentLen = 0;
        for(int num:nums){
            if(1 == num){
                currentLen++;
            }
            else{
                prevLen = Math.max(prevLen,currentLen);
                currentLen = 0;
            }
        }
        currentLen = Math.max(prevLen,currentLen);
        return currentLen;
    }
}