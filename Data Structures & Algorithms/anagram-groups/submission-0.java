class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // idea: if we sort letters of a word, it's anagrams 
        // become the same. We can use this sorted string as a key

        // create a hashmap of the sorted string and a list of other strings
        Map<String, List<String>> map = new HashMap<>();

        // loop through each word
        for (String string: strs) {
            // convert each string to a char array
            char[] array = string.toCharArray();
            // sort the array
            Arrays.sort(array);
            // convert this array back to a string to store in map
            String key = new String(array);
            // create the array list for the key and add the key
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(string);
        }

        return new ArrayList<>(map.values());


        
    }
}