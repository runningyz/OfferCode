class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }
        boolean truth = true;
        for(int i = 0;i<nums.length;i++){
            if(max<2*nums[i] && i!=maxIndex){
                truth = false;
                break;
            }
        }
        if(truth) return maxIndex;
        else return -1;
    }
}