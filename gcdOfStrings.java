class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // t divides s iff s = t +...+ t
            // i.e. str1+str2==str2+str1
        // find largest string x s.t. x divides both str1, str2
        if (!(str1 + str2).equals(str2 + str1)) { 
            //t divides s iff s = t+...+t check
            return "";
        }
        else {
            return str1.substring(0, gcd(str1.length(), str2.length()));
            // inner: find length of x
            // return substring from index 0 to index x
        }
    }
    private int gcd(int s, int t) {
        if (t == 0) {
            return s;
            // cannot divide by 0
        }
        return gcd(t, s % t);
        // between length of t, and if t divides s
    }
}
// O(n) time -> gcd takes O(logN), length of input string is considered (string iteration & equals check takes length of input)
// O(n) space -> length of input string