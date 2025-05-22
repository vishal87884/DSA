public class H_Index {
    public static void main(String[] args) {
        int arr[] = {1,3,1 };
        int res = findIndex(arr);
        System.out.println(res);
    }

    private static int findIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1]; // count[i] = number of papers with i citations

        // Step 1: Count citations
        for (int c : citations) {
            if (c >= n) {
                count[n]++; // Anything greater than n is still counted as n
            } else {
                count[c]++;
            }
        }

        // Step 2: Find h-index from end
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i]; // total papers with >= i citations
            if (total >= i) {
                return i;
            }
        }

        return 0;
    }
}
