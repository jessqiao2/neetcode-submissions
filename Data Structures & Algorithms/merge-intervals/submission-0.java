class Solution {
    public int[][] merge(int[][] intervals) {

        // sort the intervals by starting time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        // declare list of int[]
        List<int[]> result = new ArrayList<>();

        // loop through intervals
        for (int[] interval : intervals) {
            // if there are no intervals in the result or the current interval
            // doesnt overlap with the last result
            if (result.isEmpty() || interval[0] > result.get(result.size() - 1)[1]) {
                // add the interval into result
                result.add(interval);
            } else {
                // merge the intervals
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() -1)[1], interval[1]);
            }
        }

        // return the result as an array
        return result.toArray(new int[result.size()][]);
        
    }
}
