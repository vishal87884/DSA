public class RemoveDuplicateFormSortedArrayII {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,2,3,3 };
        removeDuplicateElement(arr);
        for (int i = 0; i <removeDuplicateElement(arr); i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static int removeDuplicateElement(int[] arr) {
        int temp = 0;
        int res = 1;
        if (arr.length >= 2 && arr[0] == arr[1]) {
            temp++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i] && temp < 2) {
                arr[res++] = arr[i];
                temp++;
            }
            if (arr[i - 1] != arr[i]) {
                arr[res++] = arr[i];
                temp = 0;
                temp++;
            }
        }
        return res;
    }
}
