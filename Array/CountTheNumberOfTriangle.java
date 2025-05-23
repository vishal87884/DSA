import java.util.Arrays;

public class CountTheNumberOfTriangle {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 7 };
        int res = findTheTriangle(arr);
        System.out.println(res);
    }

    private static int findTheTriangle(int[] arr) {
        int res = 0;
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            int l = 0, r = i - 1;
            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum > arr[i]) {
                    res += r - l;
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}
