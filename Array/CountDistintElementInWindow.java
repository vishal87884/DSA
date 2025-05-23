import java.util.ArrayList;
import java.util.HashSet;

public class CountDistintElementInWindow {
    public static void main(String[] args) {
        int arr[] = {8 };
        countDistintElement(arr, 1);
    }

    private static void countDistintElement(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j <= arr.length - k; j++) {
            int s = j, e = k + j;
            HashSet<Integer> hs = new HashSet<>();
            while (s < e) {
                hs.add(arr[s]);
                s++;
            }
            list.add(hs.size());
        }
        System.out.println(list);
    }
}
