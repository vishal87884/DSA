public class FindTheMajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        int res = findTheMajorityElement(nums);
        System.out.println(res);
    }

    private static int findTheMajorityElement(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else if (nums[i] == 2) {
                count--;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
