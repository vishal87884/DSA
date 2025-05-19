public class MaximunSum {
    public static void main(String[] args) {
        int arr[] = { -1};
        int maxSum = findMaxSumArray(arr);
        System.out.println(maxSum);
    }

    private static int findMaxSumArray(int[] arr) {
        int max = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
            res = Math.max(res, max);
            if (max < 0) {
                max = 0;
            }
        }
        return res;
    }
}
