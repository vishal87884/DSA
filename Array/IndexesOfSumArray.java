import java.util.ArrayList;

public class IndexesOfSumArray {
    public static void main(String[] args) {
        int arr[] = { 9 };
        ArrayList<Integer> al = secondLogic(arr);
        System.out.println(al);
    }

    private static ArrayList<Integer> findTheIndexes(int[] arr) {
        int target = 9;
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int n = arr.length - 1;
        while (i <= n) {
            int s = 0, e = arr.length - i - 1;
            while (e < arr.length) {
                int sum = 0;
                for (int j = s; j <= e; j++) {
                    sum += arr[j];
                    if (sum == target) {
                        al.add(s + 1);
                        al.add(j + 1);
                        return al;
                    }
                }
                s++;
                e++;
            }
            i++;
        }
        al.add(-1);
        return al;
    }

    private static ArrayList<Integer> secondLogic(int[] arr) {
        int target = 9;
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0, start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > target && start <= i) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                al.add(start + 1);
                al.add(i + 1);
                return al;
            }
        }
        al.add(-1);
        return al;
    }
}
