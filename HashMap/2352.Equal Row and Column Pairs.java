import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> pairs = new HashMap<>();

        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                tempString.append(grid[i][j]);
                tempString.append(",");
            }
            pairs.put(tempString.toString(), pairs.getOrDefault(tempString.toString(), 0) + 1);
            tempString = new StringBuilder();
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                tempString.append(grid[j][i]);
                tempString.append(",");
            }
            Integer total = pairs.get(tempString.toString());
            if (total != null) {
                count += total;
            }
            tempString = new StringBuilder();
        }

        return count;
    }
}