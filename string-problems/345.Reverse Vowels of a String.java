class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        int j = s.length() - 1;
        int i = 0;
        char temp;
        while (i <= j) {
            if (isVowel(result.charAt(i)) && isVowel(result.charAt(j))) {
                temp = result.charAt(i);
                result.setCharAt(i, result.charAt(j));
                result.setCharAt(j, temp);
                i++;
                j--;
                if (i > j)
                    break;
            }

            if (!isVowel(result.charAt(i)))
                i++;
            if (!isVowel(result.charAt(j)))
                j--;
        }

        return result.toString();
    }

    boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}