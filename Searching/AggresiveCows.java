package Searching;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int arr[] = { 6, 4 ,3, 16 ,20 ,7, 18 ,10};
        System.out.println(aggressiveCows(arr, 5));
    }

    public static int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            return 0;
        }
        Arrays.sort(arr);
        int res = Integer.MIN_VALUE;
        int s = 0, e = n - 2, f = arr[0];
        while (s <= e) {
            int m = s + (e - s) / 2;
            int valid = (n - 1 - m);
            if (valid > k - 2) {
                s = m + 1;
                res = Math.max(res, arr[m] - f);
            } else {
                e = m - 1;
            }

        }
        return res;
    }
}
