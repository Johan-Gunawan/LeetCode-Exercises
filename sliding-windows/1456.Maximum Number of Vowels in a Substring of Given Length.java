class Solution {
    public int maxVowels(String s, int k) {
        int totVowel = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                totVowel++;
            }
        }

        int currVowel = totVowel;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k)))
                currVowel--;
            if (isVowel(s.charAt(i)))
                currVowel++;
            totVowel = Math.max(currVowel, totVowel);
        }

        return totVowel;

    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}