class Solution {
    private static String DELIMITER = "#";

    // for each string
    // append string size, delimiter, and then string

    public String encode(List<String> strs) {
        var sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append(DELIMITER).append(str);
        }

        return sb.toString();
    }

    // 5#Hello5#World

    public List<String> decode(String str) {
        List<String> list = new ArrayList();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int wordLength = Integer.parseInt(str.substring(i, j));
            list.add(str.substring(j + 1, j + 1 + wordLength));

            i = j + 1 + wordLength;
        }

        return list;
    }
}
