class Solution {
    public int maxOperations(int[] nums, int k) {
        if (k == 1 || nums.length == 1)
            return 0;
        int total = 0;
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 < p2) {
            int sum = nums[p1] + nums[p2];
            if (sum == k) {
                total++;
                p1++;
                p2--;
            } else if (sum > k)
                p2--;
            else
                p1++;
        }

        return total;
    }
}