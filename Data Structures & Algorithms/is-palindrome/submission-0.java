class Solution {
    public boolean isPalindrome(String s) {
        //racecar 7/2 = 3
        //abba
        //Was it a car or a cat I saw?
        Deque<Character> stack = new ArrayDeque<>();
        var transformedString = transformString(s);
        int midpoint = transformedString.length()/2;

        for (int i = 0; i<midpoint; i++) {
            stack.push(transformedString.charAt(i));
        }

        if (transformedString.length() % 2 == 1) {
            midpoint++;
        }

        for (int i = midpoint; i<transformedString.length(); i++) {
            if (stack.pop() != transformedString.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    private String transformString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
