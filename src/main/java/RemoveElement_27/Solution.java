class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val){
                result++;
            }
        }    
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val){
                int cursor = i;
                for(int j = i+1;j < nums.length-counter;j++){
                    if(nums[j] != val){
                        int tmp = nums[j];
                        nums[j] = nums[cursor];
                        nums[cursor] = tmp;
                        cursor = j;
                    }
                }
                counter++;
            }
        }
        return nums.length-result;
    }
}