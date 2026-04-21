class Solution {
    public boolean isAnagram(String s, String t) {

        // store string characters in hashmap
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // loop through first string and store the
        // character and frequency in the map
        for (char c : s.toCharArray()) {
            // if the character is already in the map
            // add to the frequency
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // loop through second string and do the same
        for (char c : t.toCharArray()) {
            // if the character is already in the map
            // add to the frequency
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        // return true if the two hashmaps are equal
        return map.equals(map2);
    }
}
