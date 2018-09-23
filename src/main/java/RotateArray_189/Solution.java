class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int[] tmp = new int[k];
        for(int i = 0;i < tmp.length;i++){
            tmp[i] = nums[len+i-k];
        }
        for(int i = len-k-1;i >= 0 ;i--){
            nums[i+k] = nums[i]; 
        }
        for(int i = 0;i< tmp.length;i++){
            nums[i] = tmp[i];
        }
    }
}