/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */

class Solution {

    private static Map<Character, char[]> map = new HashMap<>();
    static {
        map.put('2', new char[] {'a', 'b', 'c'});
        map.put('3', new char[] {'d', 'e', 'f'});
        map.put('4', new char[] {'g', 'h', 'i'});
        map.put('5', new char[] {'j', 'k', 'l'});
        map.put('6', new char[] {'m', 'n', 'o'});
        map.put('7', new char[] {'p', 'q', 'r', 's'});
        map.put('8', new char[] {'t', 'u', 'v'});
        map.put('9', new char[] {'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        backtracking(0, res, digits, new StringBuilder());
        return res;
    }

    private void backtracking(int index, List<String> result, String digits, StringBuilder sb) {
        if (index >= digits.length()) {
            result.add(sb.toString());
            return;
        }
        char number = digits.charAt(index);
        char[] letters = map.get(number);
        for (int i = 0; i < letters.length; i++) {
            sb.append(letters[i]);
            backtracking(index+1, result, digits, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}