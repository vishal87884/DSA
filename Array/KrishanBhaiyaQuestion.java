public class KrishanBhaiyaQuestion {
    public static void main(String[] args) {
        int arr1[]={1,2,3,5,6,0,0,0};
        int arr2[]={2,3,5};
        int count=0;
        int n=arr1.length-1;
        for (int i = 0; i < arr1.length-1; i++) {           
           if (arr1[i]>arr2[count]&&count<arr2.length) {
            int temp=n-1;
               for(int j=temp;j>=i;j--){
                 arr1[j+1]=arr1[j];
               }
               arr1[i]=arr2[count];
               count++;
           }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
