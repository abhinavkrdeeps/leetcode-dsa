package arrays.sorting.arrays.algo;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxVal = Integer.MIN_VALUE;
        int currMin=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-currMin;
            if(profit>=0){
                if(profit>=maxVal){
                    maxVal=profit;
                }
            }
            if(prices[i]<currMin){
                currMin=prices[i];
            }
        }
        return maxVal>=0?maxVal:0;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
