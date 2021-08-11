Link: https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> prevNums = new HashMap<>();
        for(int index=0; index<nums.length; index++){
            int difference = target - nums[index];
            if(prevNums.containsKey(difference)){
                return new int[]{prevNums.get(difference),index};
            }
            prevNums.put(nums[index],index);
        }
        return new int[0];
    }
}