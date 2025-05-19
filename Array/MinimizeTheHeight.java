import java.util.Arrays;

public class MinimizeTheHeight {
    public static void main(String[] args) {
        int arr[]={1,8,10,6,4,6,9,1};
        Arrays.sort(arr);
        int n=arr.length-1,k=7;
        int res = arr[n - 1] - arr[0];

        // For all indices i, increment arr[0...i-1] by k and
        // decrement arr[i...n-1] by k
        for (int i = 1; i < arr.length; i++) {

            // Impossible to decrement height of ith tower by k, 
            // continue to the next tower
            if (arr[i] - k < 0)
                continue;

            // Minimum height after modification
            int minH = Math.min(arr[0] + k, arr[i] - k);

            // Maximum height after modification
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            // Store the minimum difference as result
            res = Math.min(res, maxH - minH);
        }
        System.out.println(res);
    }
}

class Solution {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        
        // Initial maximum difference without modification
        int res = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            // If decrementing makes the height negative, skip
            if (arr[i] - k < 0)
                continue;

            // Calculate minimum and maximum heights after modification
            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            // Update the result with the minimum difference
            res = Math.min(res, maxH - minH);
        }
        return res;
    }
}
