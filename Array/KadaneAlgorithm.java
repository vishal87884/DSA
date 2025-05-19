public class KadaneAlgorithm {
    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        int max=0;
        int res=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max+=arr[i];
            if (max>res) {
               res=max;
            }
            if (max<0) {
                max=0;
            }
        }
        System.out.println(res);
    }
}
