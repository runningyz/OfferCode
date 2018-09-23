class Solution {
    public int thirdMax(int[] nums) {
        int[] maxArray = new int[3];
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        maxArray[0] = Integer.MIN_VALUE;
        maxArray[1] = Integer.MIN_VALUE;
        maxArray[2] = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            //insert new value to smallest position
            if((nums[i]>maxArray[2] || nums[i] == Integer.MIN_VALUE) && !set.contains(nums[i])){
                maxArray[2] = nums[i];
                set.add(nums[i]);
                counter++;
            }
            //sort start---
            if(maxArray[2]>maxArray[1]){
               int tmp = maxArray[2];
                maxArray[2] = maxArray[1];
                maxArray[1] = tmp;
            }
            if(maxArray[1]>maxArray[0]){
               int tmp = maxArray[1];
                maxArray[1] = maxArray[0];
                maxArray[0] = tmp;
            }
            //sort end---
        }
        if(nums.length < 3 || counter<3){
            return maxArray[0];
        }
        else return maxArray[2];
    }
}