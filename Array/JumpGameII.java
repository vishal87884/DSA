public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = { 2,3,1,1,4};
        int res = jump(nums);
        System.out.println(res);
    }

    private static int jump(int[] arr) {

        if (arr.length == 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }
        int jump = 0;
        int temp = arr[0];
        jump = 0;
        for (int i = 1; i < arr.length; i++) {
            temp--;
            if (temp < arr[i] && temp < arr.length - 1) {
                temp = arr[i];
                jump++;
            }
        }
        return jump;
    }
}
