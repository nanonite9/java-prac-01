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

        // a:1, b:2, c:3
        // a:2, b:3, c:1 (each frequency should match, i.e. we should use map)
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        // incrementing freqs for word1, word2
        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0)+1);
        }
        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0)+1);
        }

        // if chars are same in both sets, if freqs are same in both sets
        if ((freq1.keySet().equals(freq2.keySet())) && (freq1.values().equals(freq2.values()))) {
            return true; 
        }
/*
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
*/
    }
}

// O(nlogn) time
// O(n) space