class Solution {
    public boolean isPalindrome(String s) {

        // use two pointers
        int left = 0;
        int right = s.length() - 1;

        // loop through the string
        while (left < right) {
            // check if the character is alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            // compare the left and right values
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;

        }

        return true;
        
    }
}
