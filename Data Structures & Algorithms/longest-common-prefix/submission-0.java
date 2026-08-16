class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        // first set prefix as strs[0]
        // iterate thru array to see if all of them contain prefix
        // if not, then substring to reduce word by 1 letter
        // else return prefix
        var prefix = strs[0];

        for (int i=1; i<strs.length;i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
            }

            if (prefix.isEmpty()) {
                return "";
            }
        } 

        return prefix;

    }
}