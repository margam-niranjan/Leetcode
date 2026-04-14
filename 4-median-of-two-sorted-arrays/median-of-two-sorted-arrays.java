class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0,j = 0,k = 0;
        int nums3[] = new int[nums1.length + nums2.length];
        double d=0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                k++;
                i++;
            }
            else {
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
        while (i < nums1.length) {
            nums3[k] = nums1[i];
            k++;
            i++;
        }
        while (j < nums2.length) {
            nums3[k] = nums2[j];
            k++;
            j++;
        }
        int mid = (nums1.length + nums2.length) / 2;
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (nums3[mid - 1] + nums3[mid]) / 2.0;
        }
        else{
            d = nums3[nums3.length/2];
        }
        return d;
    }
}