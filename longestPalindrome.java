Link: https://leetcode.com/problems/longest-palindromic-substring
Description: Given a string s, return the longest palindromic substring in s.

class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int resultLen = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // odd len
            int left = i, right = i;
            while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > resultLen) {
                    result = s.substring(left, right + 1);
                    resultLen = right - left + 1;
                }
                left--;
                right++;
            }

            // even len
            left = i;
            right = i + 1;
            while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > resultLen) {
                    result = s.substring(left, right + 1);
                    resultLen = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return result;
    }
}