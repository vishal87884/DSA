public class MaximunSumSubArray {
    public static void main(String[] args) {
        int arr[] = { 5, -3, 5 };
        // int res = findSum(arr);
        int res = secondWay(arr);
        System.out.println(res);
    }

    private static int findSum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                res = Math.max(res, sum);
            }
            for (int j = 0; j < i; j++) {
                sum += arr[j];
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    private static int secondWay(int[] arr) {
        int res = arr[0];
        int sum = 0;
        int currentMaxSum = 0;
        int currentMinSum = 0;
        int maxSum = arr[0];
        int minSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            currentMaxSum = Math.max(currentMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
            currentMinSum = Math.min(currentMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currentMinSum);
        }
        int normal = sum - minSum;
        if (sum == minSum) {
            return maxSum;
        }
        res = Math.max(maxSum, normal);
        return res;
    }
}
