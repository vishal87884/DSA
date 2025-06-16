package Searching;

public class FindThePeakEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 8, 3 };
        System.out.println(find(arr));
    }

    private static boolean find(int[] arr) {
        int n = arr.length ;
        if (arr[0] > arr[1]) {
            return false;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return true;
        }
        int s = 1, e = n - 2;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                return true;
            }
            if (arr[m] < arr[m + 1]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return false;
    }
}
