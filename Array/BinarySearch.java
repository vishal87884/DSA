import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();
        prime.addAll(List.of(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97));

        int data = 6;
        int s = 0, e = prime.size() - 1;
        int nearest = prime.get(0);
        while (s < e) {
            System.out.println("-------------");
            int m = s + (e - s) / 2;
            int midVal = prime.get(m);
         
            if (Math.abs(midVal - data) < Math.abs(nearest - data)) {
                nearest = midVal;
            } else if (Math.abs(midVal - data) == Math.abs(nearest - data)) {
                
                nearest = Math.min(nearest, midVal);
            }
            if (prime.get(m) > data) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        System.out.println(nearest);
    }
}
