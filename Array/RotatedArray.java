public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        if (k <= 0) {
            return;
        }
        k = k % arr.length;
        swap(arr, 0, arr.length - 1);
        swap(arr, 0, k-1);
        swap(arr, k, arr.length - 1);
    }

    private static void swap(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
