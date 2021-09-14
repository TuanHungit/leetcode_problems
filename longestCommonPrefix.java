Link: https://leetcode.com/problems/longest-common-prefix
Description: Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(res) == -1){
                res = res.substring(0, res.length() - 1);
                if (res.isEmpty())
                    return "";
            }
        }
        
        return res;
    }
}