class Solution {
    //Hello World
    //5#Hello5#World
    private final static String delimiter = "#";

    public String encode(List<String> strs) {


        var sb = new StringBuilder();
        for (String s: strs) {
            sb.append(s.length() + delimiter + s);
        }

        return sb.toString();
    }
        
    //5#Hello5#World
    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int currentPosition = 0;

        while (currentPosition < str.length()) {
            int delimiterPosition = currentPosition;

            while (str.charAt(delimiterPosition) != '#') {
                delimiterPosition++;
            } 

            System.out.println(currentPosition);
            System.out.println(delimiterPosition);

            int stringLength = Integer.parseInt(str.substring(currentPosition, delimiterPosition));

            int start = delimiterPosition + 1;
            int end = start + stringLength;

            currentPosition = end;

            var word = str.substring(start, end);
            System.out.println(word);
            decodedStrings.add(word);
        }

        return decodedStrings;

    }
}
