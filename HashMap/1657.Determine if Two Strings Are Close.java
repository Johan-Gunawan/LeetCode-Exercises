import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word2.length() != word1.length())
            return false;
        HashMap<Character, Integer> setWord2 = new HashMap<>();
        for (char c : word2.toCharArray()) {
            setWord2.put(c, setWord2.getOrDefault(c, 0) + 1); // auto-boxed to Character
        }

        HashMap<Character, Integer> setWord1 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            setWord1.put(c, setWord1.getOrDefault(c, 0) + 1); // auto-boxed to Character
        }

        for (char c : setWord2.keySet()) {
            if (!setWord1.keySet().contains(c)) {
                return false;
            }
        }

        int remove = 0;
        for (char c : word1.toCharArray()) {
            if (!setWord2.keySet().contains(c)) {
                remove++;
            }
        }

        if (word1.length() - remove < word2.length()) {
            return false;
        } else {
            return setWord1.values().stream().sorted().toList()
                    .equals(setWord2.values().stream().sorted().toList());
        }
    }
}