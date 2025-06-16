package Searching;

public class SearchInRotetedArray {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key = 3;
        int res = findTheIndex(arr, key);
        System.out.println(res);
    }

    private static int findTheIndex(int[] arr, int key) {
        int res = 0;
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] >= arr[s]) {
                if (arr[s] <= key && arr[mid] > key) {
                    e = mid - 1;

                } else {
                    s = mid + 1;
                }
            } else {
                if (arr[mid] <key && arr[e] >= key) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return res;
    }
}
