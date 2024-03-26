package kz.zhami.interview.algorithms.another;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(getBestProfit_2(arr));
    }

    public static int getBestProfit_2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int bestProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            bestProfit = Math.max(bestProfit, prices[i] - min);
        }
        return bestProfit;
    }


    public static int getBestProfit_1(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_Profit = 0;
        for (int i = 0; i < prices.length; i++) {
            min_price = Math.min(min_price, prices[i]);
            max_Profit = Math.max(max_Profit, prices[i] - min_price);
        }
        return max_Profit;
    }

    public static int getBestProfit(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int minCounter = 0;
        int maxCounter = 0;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min > max - min) {
                max = arr[i];
                maxCounter = i;
            }
            if (arr[i] < min && minCounter < maxCounter) {
                min = arr[i];
                minCounter = i;
            }
        }

        return Math.max((max - min), 0);
    }
}
