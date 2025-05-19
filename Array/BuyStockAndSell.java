public class BuyStockAndSell {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int profit = 0, purches = arr[0];
        int final_profit = 0;

        for (int i = 0; i < arr.length; i++) {
            profit = Math.max(profit, arr[i] - purches); // Calculate potential profit
            if (purches > arr[i]) { // New purchase point
                final_profit += profit; // Add previous segment profit
                purches = arr[i];      // Update purchase price
                profit = 0;           // Reset profit for new segment
            }
        }

        // Add remaining profit for the last segment
        final_profit += profit;

        System.out.println(final_profit);
    }
    //second case
    public int maxProfit(int[] price) {
        int maxProfit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                maxProfit += price[i] - price[i - 1];
            }
        }
        return maxProfit;
    }
}
