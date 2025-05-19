public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 4, 5, 0, 7 };

        int nonZeroIndex = 0; 
            
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
