import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        // use of map
        // byMap(arr);

        // use of boyer moore voting alogo
        boyerMooreVoting(arr);
    }

    private static void boyerMooreVoting(int[] arr) {
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
    
        // Step 1: Find potential candidates
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        // Step 2: Validate the candidates
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
        
        List<Integer> result = new ArrayList<>();
        if (count1 >= arr.length / 3) result.add(candidate1);
        if (count2 >= arr.length / 3) result.add(candidate2);
System.out.println(result);
        }

    // private static void byMap(int[] arr) {
    // Map<Integer,Integer> hs=new HashMap<>();
    // for (int i : arr) {
    // hs.put(i, hs.getOrDefault(i, 0)+1);
    // }
    // List<Integer> list=new ArrayList<>();
    // for (Entry<Integer, Integer> value :hs.entrySet()) {
    // if (value.getValue()>=(arr.length/3)) {
    // list.add(value.getKey());
    // }
    // }
    // System.out.println(list);
    // }
}
