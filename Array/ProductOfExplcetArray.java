public class ProductOfExplcetArray {
    public static void main(String[] args) {
        int[] arr = { -1, 1, 0, -3, 3 };
        int[] result = productExceptSelf(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        int mul = 1;
        int zero = 0;
        for (int i : arr) {
            if (i != 0) {
                mul *= i;
            } else {
                zero++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (zero == 0) {
                res[i] = mul / arr[i];
            } else if (zero == 1 && arr[i] == 0) {
                res[i] = mul;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }
}
