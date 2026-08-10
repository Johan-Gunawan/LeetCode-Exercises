import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> arrCounter = new HashMap<>();
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arrCounter.put(arr[i], arrCounter.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer val : arrCounter.values()) {
            unique.add(val);
        }

        return unique.size() == arrCounter.size();
    }
}