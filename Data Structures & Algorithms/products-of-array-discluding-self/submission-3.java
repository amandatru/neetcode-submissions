class Solution {
    public int[] productExceptSelf(int[] nums) {
        // [1 2 4 6]
        // [1 1 2 8]
        // [48  24  6  1]
        // [48  24  12 8]

        int[] leftToRightProducts = new int[nums.length];

        leftToRightProducts[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftToRightProducts[i] = nums[i - 1] * leftToRightProducts[i - 1];
        }


        int product = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            product *= nums[i+1];
            leftToRightProducts[i] *= product;
        } 

        return leftToRightProducts;
    }
}
