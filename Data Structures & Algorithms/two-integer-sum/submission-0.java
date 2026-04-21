class Solution {
    public int[] twoSum(int[] nums, int target) {

        // for each element in nums, there should exist a number in the array
        // that is the equal to target - nums

        // use hashmap to store the number and index
        Map<Integer, Integer> map = new HashMap<>();

        // loop through nums
        for (int i = 0; i < nums.length; i++) {

            // find the complement of the number
            int complement = target - nums[i];

            // if the complement is already in the map, return this
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // otherwise, add the number and index to the map
            map.put(nums[i], i);


        }

        // return 0 as default 
        return new int[] {0,0};
        
        
    }
}
