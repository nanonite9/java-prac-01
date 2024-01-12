class Solution {
    public boolean closeStrings(String word1, String word2) {
        // close if congruent via swap 
            // at one particular index || one particular char swap
        // op2 allows for reassigning letter frequency
        
        // # of chars == check
        // should also have one of each char 
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        // 1:1 swap
        for (char c : word1.toCharArray()) {
            arr1[c - 'a']++;
        }

        // 1:n swap
        for (char c : word2.toCharArray()) {
            arr2[c - 'a']++;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0 && arr2[i] > 0) {
                return true;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

//    a:1, b:2, c:3
//    a:2, b:3, c:1 (each frequency should match, i.e. we should use map)
}

// O(nlogn) time
// O(n) space