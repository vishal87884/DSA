public class FindSecondLargestElement {
    public static void main(String agrs[]) {
        int arr[] = {10,10,101 };
        int max = arr[0];
        int secMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] && secMax < max) {
                secMax = max;
            } else {
                if (secMax < arr[i] && max > arr[i]) {
                    secMax = arr[i];
                }
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(max + " " + secMax);
    }
}