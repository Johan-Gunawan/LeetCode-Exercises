class Solution {
    public int largestAltitude(int[] gain) {
        int result = gain[0] < 0 ? 0 : gain[0];

        for (int i = 1; i < gain.length; i++) {
            gain[i] = gain[i - 1] + (gain[i]);
            System.out.println(gain[i]);
            result = Math.max(result, gain[i]);
        }

        return result;
    }
}