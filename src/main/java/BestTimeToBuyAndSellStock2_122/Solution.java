package main.java.BestTimeToBuyAndSellStock2_122;
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0;i<prices.length-1;i++){
            if(prices[i+1]-prices[i] > 0){
                int diff = prices[i+1]-prices[i];
                sum += diff;
            }
        }
        return sum;
    }
}