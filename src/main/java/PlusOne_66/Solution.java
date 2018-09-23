class Solution {
    public int[] plusOne(int[] digits) {
        int cursor = digits.length-1;
        boolean stop = false;
        while(!stop){
            if(digits[cursor]+1 == 10){
                digits[cursor] = 0;
                cursor--;
            }
            else{
                digits[cursor] += 1;
                stop = true;
            }
            if(cursor == -1){
                int len = digits.length+1;
                int[] returnArray =  new int[len];
                returnArray[0] = 1;
                for(int i = 1;i < returnArray.length;i++){
                    returnArray[i] = digits[i-1];
                }
                return returnArray;
            }
        }
        return digits;
    }
}