public class RotetedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int d = 2;
        // firstSolution(arr, d);// time complexcity O(n*m)
        secondSolution(arr, d);// time complexity O(n)
    }

    private static void secondSolution(int[] arr, int d) {
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // private static void firstSolution(int[] arr, int d) {
    // d = d % arr.length;
    // while (d > 0) {
    // int temp = arr[0];
    // for (int i = 0; i < arr.length - 1; i++) {
    // arr[i] = arr[i + 1];
    // }
    // arr[arr.length - 1] = temp;
    // d--;
    // }
    // for (int i : arr) {
    // System.out.print(i + " ");
    // }
    // }
}
