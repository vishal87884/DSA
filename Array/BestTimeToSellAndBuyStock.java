public class BestTimeToSellAndBuyStock {
    public static void main(String args[]) {
        int arr[] = { 7,6,4,3,1};
        int res = findBestTime(arr);
        System.out.println(res);
    }

    private static int findBestTime(int[] arr) {
        int res = 0;
        int purchase = arr[0];
        for (int i : arr) {
                purchase = Math.min(i, purchase);
                res = Math.max(res, i - purchase);
      
        }
        return res;
    }
}
