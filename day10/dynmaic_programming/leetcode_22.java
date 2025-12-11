class Solution {

    void func(int n, List<String> res, String curr_bracket, int open, int close) {

        // base case: if string length == 2*n, add result
        if (curr_bracket.length() == 2 * n) {
            res.add(curr_bracket);
            return;
        }

        // add '(' if possible
        if (open < n) {
            func(n, res, curr_bracket + "(", open + 1, close);
        }

        // add ')' if possible
        if (close < open) {
            func(n, res, curr_bracket + ")", open, close + 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        func(n, res, "", 0, 0);
        return res;
    }
}
