import java.util.Arrays;

public class NextPermutation {
    public static void main(String args[]) {
        int arr[] = { 3,2,1};
        nextPermu(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPermu(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot != -1) {
            for (int i = n - 1; i > pivot; i--) {
                if (arr[i] > arr[pivot]) {
                    swap(arr, i, pivot);
                    break;
                }
            }
        }
        reverse(arr, pivot + 1, n-1);

    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
