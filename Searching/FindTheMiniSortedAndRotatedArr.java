package Searching;

public class FindTheMiniSortedAndRotatedArr {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 2, 3, 4 };
        int res = find(arr);
        System.out.println(res);
    }

    private static int find(int[] arr) {
        int s = 0, h = arr.length - 1;
        while (s < h) {

            int mid = s + (h - s) / 2;
            if (arr[mid] > arr[h]) {
                s = mid + 1;

            } else {

                h = mid ;
            }
        }
        return arr[s];
    }
}
