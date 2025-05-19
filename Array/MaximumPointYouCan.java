public class MaximumPointYouCan {
    public static void main(String[] args) {
        int arr[] = {9,7,7,9,7,7,9 };
        int k = 7;
        int res = findTheMaximun(arr, k);
        System.out.println(res);
    }

    private static int findTheMaximun(int[] arr, int k) {
        if (k > arr.length || k < 0) {
            return 0;
        }
        int res = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        res = sum;
        int temp = k - 1;
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            sum -= arr[temp];
            sum += arr[i];
            temp--;
            res = Math.max(sum, res);
        }
        return res;
    }
}
