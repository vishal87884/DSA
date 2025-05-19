import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4 };
        int target = 6;
        int res[] = twoSum(arr, target);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return nums;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : nums) {
            list.add(integer);
        }
        for (Integer integer : list) {
            if (list.contains(Math.abs(target - integer))) {
                
                return new int[] { list.indexOf(integer), list.indexOf(target - integer) };
            }
        }
        return new int[] { 0 };
    }
}
