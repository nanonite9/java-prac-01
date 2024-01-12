class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // t divides s iff s = t +...+ t
            // i.e. str1+str2==str2+str1
        // find largest string x s.t. x divides both str1, str2
        if ((str1 + str2) == (str2 + str1)) {
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }
        else {
            return "";
        }
    }
    public int gcd(int s, int t) {
        if (t == 0) {
            return s;
        }
        return gcd(t, s % t);
    }
}