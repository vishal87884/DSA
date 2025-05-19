public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        int m = nums2.length;
        int n = 3;
        mergeArray(nums1, nums2, m, n);
    }

    private static void mergeArray(int[] nums1, int[] nums2, int m, int n) {
        int i =m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0)
        {
            if(nums1[i]> nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else
            {
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0)
        {
            nums1[k--]=nums2[j--];
        }
    }
}
