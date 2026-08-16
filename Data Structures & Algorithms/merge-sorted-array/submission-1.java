class Solution {
    //insert the nums2 numbers into nums1 end
    //Arrays sort
    // 0  1  2   3 4 5
    //[10,20,20,40,2,1]
    // length = 6
    //i = 5

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2Pointer = 0;
        for (int i=nums1.length-1; i>= nums1.length-n; i--) { //adjust for loop
                if (nums2Pointer > n) {
                    break;
                }
                nums1[i] = nums2[nums2Pointer];
                nums2Pointer++;
        }

        Arrays.sort(nums1);

    }
}