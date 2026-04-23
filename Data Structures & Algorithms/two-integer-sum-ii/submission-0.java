class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // use two pointer
        int left = 0;
        int right = numbers.length - 1;

        // loop through 
        while (left < right) {
            // find current sum
            int currentSum = numbers[left] + numbers[right];

            // compare current sum to target
            if (currentSum == target) {
                return new int[] {left + 1, right + 1};
            } else if (currentSum > target) {
                // decrease right
                right--;
            } else if (currentSum < target) {
                left++;
            }
        }

        // return default array
        return new int[] {0,0};
        
    }
}
