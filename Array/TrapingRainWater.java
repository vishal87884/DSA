public class TrapingRainWater {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        int res = findTrapingWater(arr);
        System.out.println(res);
    }

    public static int findTrapingWater(int arr[]) {
        int res = 0;
        int n = arr.length;
        int l[] = new int[n];
        int r[] = new int[n];
        l[0] = arr[0];
        r[n-1] = arr[n-1];
        int max1 = arr[0];
        int max2 = arr[n-1];
        for (int i = 1; i < n; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
            if (max2 < arr[n - i - 1]) {
                max2 = arr[n - i - 1];
            }
            l[i] = max1;
            r[n - i - 1] = max2;
        }
        for (int i = 0; i < r.length; i++) {
            res += Math.min(l[i], r[i]) - arr[i];
        }
        return res;
    }
}
