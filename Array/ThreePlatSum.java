public class ThreePlatSum {
    public static void main(String[] args) {
        int arr[] = { -15, 0, -7, -5, -4, 0, 1, 5, 7, 8, 20, 20 };
        int res = findTheThree(arr);
        System.out.println(res);
    }

    private static int findTheThree(int[] arr) {
        int target = 1;
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n - 2; i++) {
            int s = i + 1, e = n - 1;
            while (s < e) {
                int sum = arr[i] + arr[s] + arr[e];
                if (sum == target) {
                    int ele1 = arr[s];
                    int ele2 = arr[e];
                    int count1 = 0, count2 = 0;
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

                } else if (sum > target) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        return res;
    }
}
