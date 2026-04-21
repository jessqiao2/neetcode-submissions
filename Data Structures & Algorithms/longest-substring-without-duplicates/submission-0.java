class Solution {
    public int lengthOfLongestSubstring(String s) {

        // use a sliding window
        int start = 0;
        int maxString = 0;
        String currString = "";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // loop through the string
        for (int end = 0; end < s.length(); end++) {
            // find current character
            char c = s.charAt(end);

            // add the character to the current string
            currString += c;

            // add the character to the frequency map
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

            // while the frequency of the character is more than 1, 
            // remove the start of the string and remove the character 
            // from the frequency map
            while (freqMap.get(c) > 1) {
                currString = currString.substring(1);
                char startChar = s.charAt(start);
                freqMap.put(startChar, freqMap.get(startChar) - 1);
                // if there is nothing in the freqMap, remove this key/value pair
                if (freqMap.get(startChar) == 0) {
                    freqMap.remove(startChar);
                }
                start++;
            }

            // compare current string to longest
            maxString = Math.max(currString.length(), maxString);
            

        }

        return maxString;
        
    }
}
