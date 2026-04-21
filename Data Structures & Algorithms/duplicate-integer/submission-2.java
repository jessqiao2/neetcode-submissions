class Solution {
    public boolean hasDuplicate(int[] nums) {

        // sort array
        Arrays.sort(nums);

        // loop through array
        for (int i = 1; i < nums.length; i++) {
            
            // if the current number == previous number
            // return false
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }

        return false;
        
    }
}