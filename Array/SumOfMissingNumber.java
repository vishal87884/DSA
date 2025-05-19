import java.util.Arrays;
import java.util.HashSet;

public class SumOfMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //  int sum_of_natural_no=0;
        //  int sum_of_given_number=0;
        //  for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]>0) {
        //         sum_of_given_number+=arr[i];
        //     }
        //     sum_of_natural_no+=(i+1);
        //  }
        //  int missing_number=sum_of_natural_no-sum_of_given_number;
        //  System.out.println(missing_number);
        HashSet<Integer> hs=new HashSet<>();
        int count=1;
        int missing=0;
        Arrays.sort(arr);
        for (int num : arr) {
            if (!hs.contains(num)&&num>0) {
                hs.add(num);
                if (num!=count) {
                   break; 
                }
                count++;
            }
        }
        missing=count;
        System.out.println(missing);
    }
}
