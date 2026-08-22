class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //  nums1 ke last actual element ka index i = m - 1
//  nums2 ke last element ka index j = n - 1
//  nums1 ke last position ka index k = m + n - 1
//
//  Dono arrays ke elements ko last se compare karenge
//  Jo element bada hoga, use nums1[k] mein rakhenge
//  Phir pointer ko ek step peeche karenge
//  Jab nums2 ke elements bach jayein,
//    unhe nums1 mein copy kar denge

        
        int i = m - 1;

     
        int j = n - 1;

        
        int k = m + n - 1;

    
        while (i >= 0 && j >= 0) {

           
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

           
            k--;
        }

        
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}