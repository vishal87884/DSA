import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int arr[] = {3, 0, 5, 3, 0};
        int res = secondFind(arr);
        System.out.println(res);
    }

    private static int find(int[] arr) {
        int res = 0;
        int n = arr.length;
        int i = 1;
        while (i <= n) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] > i) {
                    count++;
                }
            }
            if (count >= i) {
                res = i;
            }
            i++;
        }
        return res;
    }

    private static int secondFind(int arr[]) {
        Arrays.sort(arr);
        int res = 0;
        int n = arr.length;
        if (arr[0] > n) {
            return n;
        }
        int j = 0;
        while (n > j && arr[j] == 0) {
            j++;
        }
        if (j>=n) {
            return 0;
        }
        int value = arr[j];
        for (int i = j; i <= n; i++) {
            if (value <= n - i) {
                res = value;
                value++;
            }
        }
        return res;
    }
}
