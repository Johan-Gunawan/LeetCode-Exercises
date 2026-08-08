class Solution {
    public boolean isSubsequence(String s, String t) {
        int cnt = 0;
        if (s.length() == 0)
            return true;
        else if (t.length() == 0)
            return false;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(cnt)) {
                cnt++;
            }

            if (cnt == s.length())
                return true;
        }

        return cnt == s.length();
    }
}