Link: https://leetcode.com/problems/string-to-integer-atoi/
Description: Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

class Solution {
    public int myAtoi(String s) {
        
        int len = s.length();
        if (len == 0)
            return 0;
        
        int index = 0;
        while (index < len && s.charAt(index) == ' ' ) {
            index++;
        }
        
        boolean positive = true;
        if (index < len) {
            if (s.charAt(index) == '-') {
                positive = false;
                index ++;
            } else if (s.charAt(index) == '+'){
                positive = true;
                index ++;
            }
        }
                
        long res = 0;
        boolean isMax = false;
        while (index < len && Character.isDigit(s.charAt(index))) {
            res = res * 10 + (s.charAt(index) - '0');
            index ++;
            
            if (res > Integer.MAX_VALUE) {
                isMax = true;
                break;
            }
        } 
        
        if (isMax)
            return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        
        return positive ? (int) res : (int) ((-1) * res);
    }
}