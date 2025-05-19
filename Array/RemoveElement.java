public class RemoveElement {
    public static void main(String args[]) {
        int val = 2;
        int nums[] = { 2, 2, 3 };
        int res = removeElement(nums, val);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("count " + res);
    }

    private static int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                count++;
            }
        }
        return count;
    }

    private static int removeElement1(int[] nums, int val) {

        int i = 0, j = nums.length - 1;

        while (i <= j) {
            while (j >= 0 && nums[j] == val) {
                j--;
                if (j < 0) {
                    return 0;
                }
            }
            if (nums[i] == val && i <= j) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
            i++;
        }
        int count = 0;
        for (int k : nums) {
            if (k == val) {
                break;
            }
            count++;
        }
        return count;
    }
}
