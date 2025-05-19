public class MoveAllZeroInEnd {
    public static void main(String[] args) {
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                arr[n++]=arr[i];
            }
        }
        for (int i = n; i < arr.length; i++) {
            arr[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
