class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // use three pointers - 1 fixed, left and right

        // declare list of list of integers
        List<List<Integer>> resultSet = new ArrayList<>();

        // sort the numbers
        Arrays.sort(nums);

        //loop through the numbers 
        for (int i = 0; i < nums.length - 2; i++) {

            // declare left and right pointers
            int left = i + 1;
            int right = nums.length - 1;

            // if the fixed pointer is the same as the previous fixed pointer 
            // (indicating duplicates), skip this
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                // find the current total
                int currentTotal = nums[i] + nums[left] + nums[right];

                // if the current total > 0, move the right pointer down
                if (currentTotal > 0) {
                    right--;
                } else if (currentTotal < 0) {
                    left ++;
                } else if (currentTotal == 0) {

                    // check for duplicates 
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // check if the current total = 0
                    // add to resultSet
                    resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // increment
                    right--;
                    left++;
                } 
            }

        }

        return resultSet;
        
    }
}
