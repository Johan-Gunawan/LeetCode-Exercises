class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int tempMaxCal = 0;
        while (p1 <= p2) {
            int currMax = Math.min(height[p1], height[p2]) * (p2 - p1);
            if (tempMaxCal < currMax) {
                tempMaxCal = currMax;
            }
            if (height[p1] < height[p2]) {
                p1++;
            } else if (height[p1] > height[p2]) {
                p2--;
            } else {
                p1++;
                p2--;
            }
        }

        return tempMaxCal;
    }
}