public class BuyMaxStock {
    public static void main(String[] args) {
        int arr[]={7, 6, 4, 3, 1};
        int purchase=arr[0],profit=0;
        for (int i = 1; i < arr.length; i++) {
           
            if (arr[i]<purchase) {
                purchase=arr[i];
            }
            profit=Math.max(profit,arr[i]-purchase);
        }
        System.out.println(profit);
    }
}
