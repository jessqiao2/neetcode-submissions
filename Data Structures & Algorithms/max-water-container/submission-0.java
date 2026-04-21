class Solution {
    public int maxArea(int[] heights) {

        // use two pointers
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            // find the area
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);

            int currentArea = width * height;

            // compare the area to the maxArea
            maxArea = Math.max(maxArea, currentArea);

            // if the left value > right value, decrease right value
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }

        }

        return maxArea;
        
    }
}
