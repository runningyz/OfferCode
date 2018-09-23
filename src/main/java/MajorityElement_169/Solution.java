class Solution {
    public int majorityElement(int[] nums) {
        int overflow = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.keySet().contains(num)){
                int value = map.get(num);
                map.put(num,value+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>overflow)
                return entry.getKey();
        }
        return -1;
    }
}