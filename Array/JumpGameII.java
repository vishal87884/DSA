public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = { 7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
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
        jump = 1;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i-1;
            if (temp < arr[i] && temp < last) {
                jump++;
                temp = arr[i] ;
            }
             temp--;
        }
        return jump;
    }
}
