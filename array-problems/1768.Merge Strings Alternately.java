class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        if (word1.length() >= word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
                if (i == word2.length() - 1 && word1.length() > i + 1) {
                    sb.append(word1.substring(i + 1));
                }
            }
        } else {
            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
                if (i == word1.length() - 1 && word2.length() > i + 1) {
                    sb.append(word2.substring(i + 1));
                }
            }

        }

        return sb.toString();
    }
}