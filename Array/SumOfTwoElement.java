import java.util.HashMap;
import java.util.Map;

public class SumOfTwoElement {

    public static void main(String[] args) {
        int nums[] = { -3, 4, 3, 90 };
        int target = 0;
        int res[] = findSumOfTwoElement(nums, target);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    private static int[] findSumOfTwoElement(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return null;
    }

    // private static int[] findSumOfTwoElement(int[] nums, int target) {
    // int res[] = {-1,-1};
    // ArrayList<Integer> arrayList = new ArrayList<>();
    // for (int i = 0; i < nums.length; i++) {
    // arrayList.add(nums[i]);
    // int sum = target - nums[i];
    // int index = arrayList.indexOf(sum);
    // if (arrayList.contains(sum) && i != index && index != -1) {
    // res[0] = index;
    // res[1] = i;
    // return res;
    // }
    // }
    // return res;
    // }
}