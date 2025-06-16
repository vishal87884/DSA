package Searching;

import java.util.Arrays;

public class KthElement {
    public static void main(String[] args) {
        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        System.out.println(kthElement(arr1, arr2, 6));

    }

    public static int kthElement(int a[], int b[], int key) {
        int n1 = a.length;
        int n2 = b.length;
        int arr[] = new int[n1 + n2];
        int c = 0;
        for (int i = 0; i < n1; i++) {
            arr[c] = a[i];
            c++;
        }
        for (int i = 0; i < n2; i++) {
            arr[c] = b[i];
            c++;
        }
        Arrays.sort(arr);
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == key) {
                return m;
            }
            if (arr[m] <= key) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
