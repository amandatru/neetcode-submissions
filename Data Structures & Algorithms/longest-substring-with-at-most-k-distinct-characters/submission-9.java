class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> windowMap = new HashMap<>();
    
        int left = 0;
        int maxLength = 0;

        for (int right=0; right<s.length(); right++) {
            char c = s.charAt(right);

            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            while (windowMap.size() > k) {
                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) -1);

                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength; 

    }
}
