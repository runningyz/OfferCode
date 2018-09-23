class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        int lowest = Integer.MAX_VALUE;
        for(int i:prices){
            lowest = Math.min(lowest,i);
            maxDiff = Math.max(i-lowest,maxDiff);
        }
        return maxDiff;
    }
}