package leet.java.scala_unsupported;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }

        int[] bestSell = new int[prices.length];
        bestSell[prices.length - 1] = prices[prices.length - 1];

        for(int i = prices.length - 2; i >= 0; i--) {
            if(prices[i] > bestSell[i + 1]) {
                bestSell[i] = prices[i];
            } else {
                bestSell[i] = bestSell[i + 1];
            }
        }

        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(bestSell[i] - prices[i] > maxProfit) {
                maxProfit = bestSell[i] - prices[i];
            }
        }

        return Math.max(0, maxProfit);
    }
}
