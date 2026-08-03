class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int left = 0;
        int m = str1.length();
        int n = str2.length();
        if (m > n) {
            while (m % n != 0) {
                left = m % n;
                m = n;
                n = left;
            }
            return str1.substring(0, n);
        } else {
            while (n % m != 0) {
                left = n % m;
                n = m;
                m = left;
            }
            return str2.substring(0, m);
        }

    }
}