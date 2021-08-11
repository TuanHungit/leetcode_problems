Link: https://leetcode.com/problems/longest-substring-without-repeating-characters
Description: Given a string s, find the length of the longest substring without repeating characters.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0;
        HashMap<Character, Integer> store = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            if (store.containsKey(s.charAt(index))) {
                start = Math.max(start, store.get(s.charAt(index)) + 1);
            }
            store.put(s.charAt(index), index);
            result = Math.max(result, index - start + 1);
        }
        return result;
    }
}