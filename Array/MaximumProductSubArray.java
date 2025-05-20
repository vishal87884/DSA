public class MaximumProductSubArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, -2, 4 };
        int res =secondAlgo(arr);
        System.out.println(res);
    }

    private static int findProduct(int[] arr) {
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int max = 1;
            for (int j = i; j < arr.length; j++) {
                max *= arr[j];
                res = Math.max(res, max);
            }

        }
        return res;
    }

    private static int secondAlgo(int arr[]) {
        int res = Integer.MIN_VALUE;
        int left = 1;
        int right = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (left == 0) {
                left = 1;
            }
            if (right == 0) {
                right = 1;
            }
            left *= arr[i];
            int j = n - i - 1;
            right *= arr[j];
            res = Math.max(left, Math.max(res, right));
        }
        return res;
    }
}
