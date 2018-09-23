class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] array = new int[nums.length];
        for(int i = 0;i<nums.length;i++) array[i] = nums[i];
        quickSort(0,nums.length-1,nums);
        int low=0;
        int high=0;
        for(int i = 0;i<array.length;i++){
            if(nums[i] != array[i]){
                low = i;
                break;
            }
        }
        for(int i = array.length-1;i>=low;i--){
            if(nums[i] != array[i]){
                high = i;
                break;
            }
        }
        if(low==0 && high==0) return 0;
        else return high-low+1;
    }
    
    private void quickSort(int low,int high,int[] nums){
        if(low>=high) return;
        int target = nums[low];
        int index = partition(low,high,nums);
        nums[index] = target;
        quickSort(low,index-1,nums);
        quickSort(index+1,high,nums);
    }
    private int partition(int low,int high,int[] nums){
        int target= nums[low];
        while(low<high){
            while(nums[high]>=target && low<high) high--;
            nums[low] = nums[high];
            while(nums[low]<=target && low<high) low++;
            nums[high] = nums[low];
        }
        nums[low] = target;
        return low;
    }
}