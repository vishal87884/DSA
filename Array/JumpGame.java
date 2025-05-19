public class JumpGame {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 0 };
        boolean res = findTheJump(arr);
        System.out.println(res);
    }

    private static boolean findTheJump(int[] arr) {
        int step = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > step) {
                return false;
            }
            step = Math.max(step, i + arr[i]);
        }
        return true;
    }
}
