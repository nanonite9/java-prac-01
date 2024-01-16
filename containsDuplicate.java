class Solution {
    public boolean containsDuplicate(int[] nums) {
        // use .contains to see if value appears, iterate through the array
        HashSet<Integer> track = new HashSet<Integer>();

        for (Integer i : nums) {
            if (track.contains(i)) {
                return true;
            }
            track.add(i);
        }
        return false;
    }
}
// loop with for-each, .contains, add to set
// O(n) time -> length of array
// O(n) space -> length of array