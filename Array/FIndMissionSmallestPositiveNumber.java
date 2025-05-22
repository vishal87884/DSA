import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FIndMissionSmallestPositiveNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        int res = findTheNumber(arr);
        System.out.println(res);
    }

    private static int findTheNumber(int[] arr) {
        int res = 1;
        Arrays.sort(arr);
        for (int i : arr) {
            if (i <= 0) {
                continue;
            }
            if (res == i) {
                res++;
            } else if (res < i) {
                return res;
            }

        }
        return res;
    }

    public static int findTheNumberSecond(int arr[]) {
        int res = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer <= 0) {
                continue;
            }
            if (!arrayList.contains(integer)) {
                arrayList.add(integer);
            }
        }
        while (arrayList.contains(res)) {
            res++;
        }
        return res;
    }

    public static int findTheNumberSecond2(int[] arr) {
        Set<Integer> set = new HashSet<>();

        // Add only positive integers to the set
        for (int num : arr) {
            if (num >= 0) {
                set.add(num);
            }
        }

        // Find the smallest non-negative number not in the set
        int res = 0;
        while (set.contains(res)) {
            res++;
        }

        return res;
    }
}
