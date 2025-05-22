public class PairWithGivenSumInSortedArray {
    public static void main(String[] args) {
        int arr[] = {-1, 10, 10, 12, 15 };
        int res = findThePair(arr);
        System.out.println(res);
    }

    private static int findThePair(int[] arr) {
        int res = 0;
        int target = 125;
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int sum = arr[s] + arr[e];
            if (target == sum) {
                int ele1 = arr[s];
                int ele2 = arr[e];
                int count1 = 0;
                int count2 = 0;
                while (s <= e && ele1 == arr[s]) {
                    s++;
                    count1++;
                }
                while (s <= e && ele2 == arr[e]) {
                    e--;
                    count2++;
                }
                if (ele1 == ele2) {
                    res += (count1 * (count1 - 1)) / 2;
                } else {
                    res += count1 * count2;
                }

            } else if (sum < target) {
                s++;
            } else {

                e--;
            }

        }
        return res;
    }
}
