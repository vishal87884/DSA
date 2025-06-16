package Searching;

import java.util.Arrays;

public class MergeWithSpace {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 7, 10 };
        int arr2[] = { 4, 9 };
        secondSolution(arr1, arr2);
        for (int i : arr1) {
            System.out.print(i + " , ");
        }
        for (int i : arr2) {
            System.out.print(i + " , ");
        }
    }

    private static void merge(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        int n3 = n1 + n2;
        int c[] = new int[n3];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            int value1 = a[i];
            int value2 = b[j];
            if (value1 > value2) {
                c[k] = value2;
                k++;
                j++;
            } else {
                c[k] = value1;
                k++;
                i++;
            }
        }
        while (i < n1) {
            c[k] = a[i];
            k++;
            i++;
        }
        while (j < n2) {
            c[k] = b[j];
            k++;
            j++;
        }
        for (int t = 0; t < n1; t++) {
            a[t] = c[t];
        }
        for (int t = 0; t < n2; t++) {
            b[t] = c[(n3 - n2) + t];
        }
    }

    private static void secondSolution(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        int i = n1-1, j = 0;
        while (i >= 0 && j < n2) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
