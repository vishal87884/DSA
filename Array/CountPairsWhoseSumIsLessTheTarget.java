import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessTheTarget {
    public static void main(String[] args) {
        int arr[] = { -1, 1, 2, 3, 1 };
        int res = find(arr);
        System.out.println(res);
    }

    private static int nextSolution(List<Integer> list) {
        int target = 2;
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if (sum < target) {
                    res++;
                }
            }
        }
        return res;
    }

    private static int find(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (Integer integer : arr) {
            list.add(integer);
        }
        Collections.sort(list);
        int target = 2;
        int res = 0;
        int n = list.size() - 1;
        for (int i = 0; i < n; i++) {
            int s = i, e = n;
            while (s < e) {
                int sum = list.get(s) + list.get(e);
                if (sum < target) {
                    res++;
                    e--;
                } else if (sum >= target) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        return res;
    }

    static int countPairs(int[] arr, int target) {

        // Sort the array to use two pointer technique
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int cnt = 0;

        // Two pointer technique
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                cnt += right - left;
                left++;
            } else {
                right--;
            }
        }

        return cnt;
    }

}
