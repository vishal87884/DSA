import java.util.ArrayList;
import java.util.Arrays;

public class SumPairToClosestTarget {
    public static void main(String[] args) {
        int arr[] = { 10 };
        find(arr);
    }

    private static void find(int[] arr) {
        int target = 10;
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 1) {
            System.out.println(list);
            return;
        }
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE, i = 0, j = 0;
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int sum = arr[s] + arr[e];
            int temp = Math.abs(sum - target);
            if (res > temp) {
                i = s;
                j = e;
                res = temp;
            }
            if (sum < target) {
                s++;
            } else {
                e--;
            }
        }
        list.add(arr[i]);
        list.add(arr[j]);
        System.out.println(list);
    }
}
