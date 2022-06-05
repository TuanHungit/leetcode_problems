/* Description
*  Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
*  Notice that the solution set must not contain duplicate triplets.
* */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length - 1;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int rest = 0 - nums[i];
            int l = i + 1;
            int r = len;
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (rest == sum) {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[l]);
                    triplets.add(nums[r]);
                    result.add(triplets);
                    while (l + 1 < len && nums[l] == nums[l + 1]) l++;
                    while (r - 1 > l && nums[r] == nums[r-1]) r--;
                    l++;r--;
                } else if (rest > sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}