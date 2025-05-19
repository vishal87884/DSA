public class BestTimeToSellAndBuyStockII {
    public static void main(String[] args) {
        int arr[] = {7,1,8,9,11,9};
        int res = findProfit(arr);
        System.out.println(res);
    }

    private static int findProfit(int[] arr) {
        int res = 0;
        int buy = arr[0];
        for (int i = 0; i < arr.length; i++) {
            buy = Math.min(arr[i], buy);
            if (buy < arr[i]) {
                int max = arr[i];
                int j = i + 1;
                while (j < arr.length && max < arr[j]) {
                    max = arr[j];
                    j++;
                }
                res += max - buy;
                i = j;
                if (i<arr.length) {
                 buy = arr[i];   
                }
            }
        }
        return res;
    }
    // public int maxProfit(int[] arr) {
    //     int profit = 0;
    //     int buy = prices[0];

    //     for(int i = 1; i < prices.length; i++) {
    //         if(prices[i] - buy > 0) {
    //             profit += prices[i] - buy;
    //         }
    //         buy = prices[i];
    //     }
    //     return profit;
    // }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int min=0;
        for(int i=0;i<prices.length;i++){
           if(i==0){
               min=prices[i];
           }
           else{
               if(prices[i]<min){
                   min=prices[i];
               }else{
                   profit=profit+prices[i]-min;
                   min=prices[i];
               }
           }
        } 
        return profit;
}
}
