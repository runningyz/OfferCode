class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.keySet().contains(nums[i])){
                int index = map.get(nums[i]);
                if(Math.abs(index - i) <= k) return true;
                else map.put(nums[i],i);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}