public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={10,10};
        int max=Integer.MIN_VALUE;
        int max_second=Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
          if (max<arr[i]) {
            max_second=max;
            max=arr[i];
          }else if (arr[i]>max_second&&arr[i]!=max) {
            max_second=arr[i];
          }
       }
       System.out.println((max_second==Integer.MIN_VALUE)?-1:max_second);
    }
}
