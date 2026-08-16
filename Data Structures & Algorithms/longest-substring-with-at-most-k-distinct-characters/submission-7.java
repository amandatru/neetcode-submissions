class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s.isEmpty() || k == 0) 
            return 0;

        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right=0; right<s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) +1);

            while (window.size() > k) {
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) -1);

                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                left++;
            }

     
            maxLength = Math.max(maxLength, right-left+1);

        }

        return maxLength;
        
    }
}
