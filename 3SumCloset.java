/**
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 */

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        int len = nums.length - 1;
        for (int i = 0; i <= len; i++) {
            int l = i + 1;
            int r = len;
            while (l < r) {
                int num = nums[i] + nums[l] + nums[r];
                if (num < target) l++;
                else r--;
                if (Math.abs(num - target) < Math.abs(result - target)) {
                    result = num;
                }
            }
        }

        return result;
    }
}