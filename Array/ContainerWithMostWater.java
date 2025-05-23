public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int res = findTheContainer(arr);
        System.out.println(res);

    }

    private static int findTheContainer(int[] arr) {
        int res = 0;
        int n = arr.length - 1;
        int s = 0, e = n;
        while (s < e) {
            int water = Math.min(arr[s], arr[e]) * (e - s);
            res = Math.max(water, res);
            if (arr[s] < arr[e]) {
                s++;
            } else {
                e--;
            }
        }
        return res;
    }
}
