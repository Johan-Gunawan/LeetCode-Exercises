import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < asteroids.length; i++) {
            result.add(asteroids[i]);
            if (asteroids[i] < 0) {
                int j = result.size() - 1;
                while (j > 0 && result.get(j - 1) >= 0) {
                    if (Math.abs(asteroids[i]) > result.get(j - 1)) {
                        result.remove(j - 1);
                    } else if (Math.abs(asteroids[i]) < result.get(j - 1)) {
                        result.remove(j);
                        break;
                    } else {
                        result.remove(j);
                        result.remove(j - 1);
                        j--;
                        break;
                    }

                    j--;

                }
            }
        }

        int[] arr = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            arr[j] = result.get(j);
        }

        return arr;
    }
}