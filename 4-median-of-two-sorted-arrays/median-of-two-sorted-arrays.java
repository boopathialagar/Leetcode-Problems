class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1+n2];
        int i=0;
        int j=0;
        int k = 0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k++]=nums1[i++];
        }
        while(j<n2){
            arr[k++]=nums2[j++];
        }
        int n = arr.length;
        double result = 0;
        if(n%2 == 0){
            result = (double)(arr[(n/2)-1]+arr[n/2]) /2;
        }else{
            result = arr[n/2];
        }
        return result;
    }
}