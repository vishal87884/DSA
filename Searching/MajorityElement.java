package Searching;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2, 13 };
        int res = findMajorityElement(arr);
        System.out.println(res);
    }

    private static int findMajorityElement(int[] arr) {
        int res = 0;
        int ele = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ele == arr[i]) {
                res++;
            } else if (res == 0) {
                ele = arr[i];
            } else {
                res--;
            }
        }
        res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                res++;
            }
        }
        return res > arr.length / 2 ? res : -1;
    }
}
