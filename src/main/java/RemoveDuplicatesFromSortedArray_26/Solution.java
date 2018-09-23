class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        int len = nums.length;
        int currentPos = 0;
        int counter = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                counter++;
            }
        }
        for(int i = 1;i < len ;i++){
            if(nums[currentPos] == nums[i]){
                for(int j=currentPos;j<len-1;j++){
                    nums[j]=nums[j+1];
                }
                len--;
                i--;
            }
            else currentPos++;
        }
        return counter;
    }
}