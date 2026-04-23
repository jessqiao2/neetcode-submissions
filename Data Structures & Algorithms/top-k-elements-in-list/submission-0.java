class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. find the frequency of the nums using a hashmap
        Map<Integer, Integer> freqMap = new HashMap<>();

        // loop through all nums to count their frequency
        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // 2. use a heap to return the top k most frequent elements in freqMap
        
        // declare heap
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        // convert the map into entries
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            // add the freqMap into the heap
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            // if the heap is more than k, poll
            if (heap.size() > k) {
                heap.poll();
            }
        }
        
        // convert the heap into a result of k values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            // retrieve the key of the entry
            result[i] = heap.poll()[1];
        }

        return result;

    }
}
