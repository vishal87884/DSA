public class CircularArrayLargestSum {
//     public static void main(String[] args) {
//         int arr[]={8, -8, 9 ,-9, 10, -11, 12};
//         int res=arr[0];
//         int count=0;
//         while (count<arr.length) {
//             int max=0;
            
//             for (int i = 0; i < arr.length; i++) {
//                 max+=arr[i];
//                res=Math.max(res, max); 
//                if (max<0) {
//                 max=0;
//                }  
//             }
//             int last=arr[arr.length-1];
//             for (int i = arr.length-1; i >0; i--) {
//                 arr[i]=arr[i-1];
//             }
//             arr[0]=last;
//             count++;
//         }
//    System.out.println(res);
//     }

    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        int totalSum = 0;
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // Kadane's to find maximum sum subarray
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);

            // Kadane's to find minimum sum subarray
            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);

            // Sum of all the elements of input array
            totalSum += arr[i];
        }

        int normalSum = maxSum;
        int circularSum = totalSum - minSum;

        // If the minimum subarray is equal to total Sum, return normalSum
        if (minSum == totalSum) {
            System.out.println(normalSum);
        } else {
            int res = Math.max(normalSum, circularSum);
            System.out.println(res);
        }
    }


}
