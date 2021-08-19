Link: https://leetcode.com/problems/zigzag-conversion
Description: The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) 
            return s;
        
        StringBuilder[] sbds = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbds[i] = new StringBuilder();
        }
        int row = 0;
        char[] arr = s.toCharArray();
        boolean isDown = true;
        for (int i = 0; i < arr.length; i++) {
            sbds[row].append(arr[i]);
            if (row == 0 || (row < numRows - 1 && isDown)) {
                row ++;
                isDown = true;
            } else {
                row --;
                isDown = false;
            }
        }
        StringBuilder res = sbds[0];
        for (int i = 1; i < numRows; i++) {
            res.append(sbds[i]);
        }
        return res.toString();
    }
}