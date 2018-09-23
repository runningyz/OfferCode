class Solution {
    public void moveZeroes(int[] nums) {
        int counter = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                int cursor = i;
                for(int k = i+1;k<nums.length-counter;k++){
                    if(nums[k] != 0){
                        int tmp = nums[k];
                        nums[k] = nums[cursor];
                        nums[cursor] = tmp;
                        cursor++;
                    }   
                }
                counter++;
            }
        }   
    }
}