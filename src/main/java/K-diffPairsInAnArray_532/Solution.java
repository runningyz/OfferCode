class Solution {
    public int findPairs(int[] nums, int k) {
        int counter = 0;
        int realLen = nums.length;
        if(k != 0){
            Set<Integer> set = new HashSet<>();
            for(int num:nums){
                set.add(num);
            }
            List<Integer> list = new ArrayList<>(set);
            for(int i = 0;i<list.size();i++){
                nums[i] = list.get(i);
            }
            realLen = list.size();
        }
        else{
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            for(int i = 0;i < realLen;i++){
                for(int j = i+1;j < realLen;j++){
                    if(nums[i] == nums[j] && !set.contains(nums[i])){
                        sum++;
                        set.add(nums[i]);
                        break;
                    }
                }
            }
            return sum;
        }
        for(int i = 0;i < realLen;i++){
            for(int j = i+1;j < realLen;j++){
                if(Math.abs(nums[j]-nums[i]) == k) counter++;
            }
        }
        return counter;
    }
}