

public class MoyyeVotingAlgo {
    public static void main(String[] args) {
        int arr[] = { 6,5,5 };
        int res = findMejorityElement(arr);
        System.out.println(res);
    }

    // private static int findMejorityElement(int[] arr) {
    // Map<Integer, Integer> value = new HashMap<>();
    // for (int i = 0; i < arr.length; i++) {
    // value.put(arr[i], value.getOrDefault(arr[i], 0) + 1);
    // }
    // int candidate = -1;
    // for (Entry<Integer, Integer> entry : value.entrySet()) {
    // if (entry.getValue()>arr.length/2) {
    // candidate=entry.getKey();
    // }
    // }
    // return candidate;

    // }

    private static int findMejorityElement(int[] arr) {
        int count = 0;
        int candidate = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count++;
            }else{
            if (candidate == arr[i]) {
                candidate = arr[i];
                count++;
            } else {
                count--;
            }}
        }
        for (int i : arr) {
            if (i == candidate) {
                count++;
            }
        }
        return count > arr.length / 2 ? candidate : -1;
    }
}
