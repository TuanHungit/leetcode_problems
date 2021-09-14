Link: https://leetcode.com/problems/roman-to-integer
Description: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int len = s.length();
        int res = roman.get(s.charAt(len - 1));
        
        for (int i = 0; i < len - 1; i++) {
            if ( roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1)) ) {
                res -= roman.get(s.charAt(i));
            } else res += roman.get(s.charAt(i));
        }
        return res;
    }
}