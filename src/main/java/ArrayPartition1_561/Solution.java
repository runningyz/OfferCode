class Solution {
    public int arrayPairSum(int[] nums) {
        quickSort(0,nums.length-1,nums);
        int minSum = 0;
        for(int i = 0;i< nums.length;i++){
            if((i+1)%2 == 1) minSum += nums[i];
        }
        return minSum;
    }
    
    private void quickSort(int low,int high,int[] nums){
        if(low>=high) return;
        int target = nums[low];
        int index = partition(low,high,nums);
        nums[index] = target;
        quickSort(low,index-1,nums);
        quickSort(index+1,high,nums);
    }
    
    private int partition(int low,int high,int nums[]){
        int target = nums[low];
        while(low<high){
            while(nums[high] >= target && low<high) high--;
            nums[low] = nums[high];
            while(nums[low] <= target && low<high) low++;
            nums[high] = nums[low];
        }
        return low;
    }
}