public class MaxProduct {
    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        int max = arr[0];
        int res = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(arr[i], Math.max(arr[i] * max, arr[i] * min));
            min = Math.min(arr[i], Math.min(arr[i] * max, arr[i] * min));
            max = temp;
            res = Math.max(max, res);
        }
        System.out.println(res);
    }

}
