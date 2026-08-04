class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int nominal = nums[0];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = nominal;
            nominal *= nums[i];

        }

        nominal = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] *= nominal;
            nominal *= nums[i];
        }

        return result;
    }
}