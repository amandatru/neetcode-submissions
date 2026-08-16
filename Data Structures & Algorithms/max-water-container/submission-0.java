class Solution {
    public int maxArea(int[] heights) {
        var left = 0;
        var right = heights.length-1;
        var maxArea = Integer.MIN_VALUE;

        while (left < right) {
        var x = right - left;
        var y = Math.min(heights[left], heights[right]);
        var area = x * y;

        maxArea = Math.max(maxArea, area);

        if (heights[left] < heights[right]) {
            left++;
        }
        else {
            right--;
        }
    }

    return maxArea;
}
}
