import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0 ,0};
        List<List<Integer>> list = fintThreeSum(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> fintThreeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int s = i + 1, e = arr.length - 1;
            while (s < e) {
                int sum = arr[s] + arr[e] + arr[i];
                if (sum == 0) {
                    list.add(List.of(arr[i], arr[s], arr[e]));
                    while (s < e && arr[s] == arr[s + 1]) {
                        s++;
                    }
                    while (s < e && arr[e] == arr[e - 1]) {
                        e--;
                    }
                    s++;
                    e--;
                } else if (sum > 0) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        return list;
    }
}
