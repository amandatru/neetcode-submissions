class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //key : sorted word 
        //value: actual word
        Map<String, List<String>> wordMap = new HashMap<>();
        for (String str : strs) {

           wordMap.computeIfAbsent(getSortedWord(str), k-> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(wordMap.values());






    }

    private String getSortedWord(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
