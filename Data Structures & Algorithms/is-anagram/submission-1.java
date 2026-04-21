class Solution {
    public boolean isAnagram(String s, String t) {

        // if the length of the strings are not equal, return false
        if (s.length() != t.length()) {
            return false;
        }

        // convert to char arrays to sort
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        // sort the arrays
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        // return if the char arrays are the same
        return Arrays.equals(sSort, tSort);


    
    }

        
}
