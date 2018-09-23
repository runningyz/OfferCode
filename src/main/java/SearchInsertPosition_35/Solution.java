class Solution {
    public int searchInsert(int[] nums, int target) {
        int cursor = 0;
        int index = -1;
        if(target < nums[cursor])
            return 0;
        while(true){
            if(nums[cursor] == target){
                index = cursor;
                break;
            }
            else{
                try{
                    if(target > nums[cursor] && target < nums[cursor+1]){
                        index = cursor+1;
                        break;
                    }
                }
                //if index out of array size
                catch(ArrayIndexOutOfBoundsException e){
                    index = nums.length;
                    break;
                }
            }
            cursor++;
        }
        return index;
    }
}