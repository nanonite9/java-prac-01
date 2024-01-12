class Solution {
    public boolean halvesAreAlike(String s) {
        // string % 2 == 0
        // a.length == b.length
        // alike iff same # of vowels v, ie count[a] == count[b] (!case sensitive)

        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');

        int length = s.length();
        if (length %2 != 0 ) {
            return false;
        }
        int mid = length / 2;

        String a = s.substring(0, mid);
        String b = s.substring(mid);

        // boolean for both halves vowelCount
        return vowelCount(a, vowels) == vowelCount(b, vowels);
    }
    private int vowelCount(String half, Set<Character> vowels) {
        int count = 0;
        // if half of s has a vowel from the set, count++
        for (char c : half.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
// O(n) time -> length of input string
// O(1) space -> constant