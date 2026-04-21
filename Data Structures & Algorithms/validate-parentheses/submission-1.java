class Solution {
    public boolean isValid(String s) {

        // use HashMap to contain both closing and corresponding
        // opening brackets 
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        
        // declare stack to put opening brackets
        Stack<Character> stack = new Stack<>();

        // loop through all characters 
        for (char c: s.toCharArray()) {

            // if it is a closed bracket, check if the 
            // stack peek is the corresponding open bracket
            // at the top of the stack
            if (map.containsKey(c)) {
                // if there's no corresponding bracket, return false
                if (stack.isEmpty() || map.get(c) != stack.peek()) {
                    return false;
                }
                // remove the opening bracket from the top of stack
                stack.pop();
            } else {
                // if it is an open bracket, add this to the stack
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }
}
