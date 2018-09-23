class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int[] array = new int[len+1];
        for(int i = 0;i < len;i++){
            array[nums[i]] = 1;
        }
        int result = -1;
        for(int i = 0;i<array.length;i++){
            if(array[i] == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}