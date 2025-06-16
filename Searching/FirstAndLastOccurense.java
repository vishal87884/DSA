package Searching;

import java.util.ArrayList;

public class FirstAndLastOccurense {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 8, 8, 10 };
        int target = 8;
        ArrayList<Integer> res = searchRange(arr, target);
        System.out.println("First Occurrence: " + res.get(0));
        System.out.println("Last Occurrence: " + res.get(1));
    }

    private static ArrayList<Integer> searchRange(int[] arr, int target) {
        int n = arr.length - 1;
        ArrayList<Integer> result = new ArrayList<>();
        int mid=(n-1)/2;
        result.add(searchFirst(arr, target, 0, mid));
        result.add(searchSecond(arr, target, mid+1, n-1));
        return result;
    }

    private static int searchFirst(int[] arr, int target, int s, int e) {
        int f = -1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                f = mid;
                s=mid+1;
            }
          else  if (arr[mid] > target) {
               e=mid-1;
            } else {
               s=mid+1;
            }
        }
        return f;
    }

    private static int searchSecond(int[] arr, int target, int s, int e) {
        int l = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                l = mid;
                e=mid-1;
            }
           else if (arr[mid] > target) {
                e=mid-1;
            } else {
                s=mid+1;
            }
        }
        return l;
    }
}
