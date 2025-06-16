package Searching;

public class CountTripletOfSmall {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7 };
        long res = findTriplate(arr, 12);
        System.out.println(res);
    }

    private static long findTriplate(int[] arr, int sum) {
        long res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int s = i + 1, e = n - 1;
            while (s < e) {
                int currentSum = arr[s] + arr[e] + arr[i];
                if (currentSum < sum) {
                    res += e - s;
                    s++;
                } else {
                    e--;
                }
            }
        }
        return res;
    }
}
