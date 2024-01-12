class Solution {
    public String mergeAlternately(String word1, String word2) {
        // initialized a sb
        // check smaller length
        // go through each index until length of smaller word
        // add the characters alterating at each index
        // add remaining letters to the sb
        
        StringBuilder sb = new StringBuilder();
        int size = Math.min(word1.length(), word2.length());

        for (int i = 0; i < size; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            sb.append(word1.substring(word2.length()));
        } // substring returns from index to end

        else {
            sb.append(word2.substring(word1.length()));
        }
        return sb.toString();
    }
}
// O(n) time -> length of string
// O(n) space -> length of longer string