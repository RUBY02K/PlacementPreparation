import java .util.ArrayList;
import java.util.List;
public class gp22 {
    public List<String> generateParenthesis(int n) {
        List <String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, String curr, int open, int close, int n) {
        // base case
        if (curr.length() == 2 * n) {
            res.add(curr);
            return;
        }

        // add '(' if possible
        if (open < n) {
            backtrack(res, curr + "(", open + 1, close, n);
        }

        // add ')' if valid
        if (close < open) {
            backtrack(res, curr + ")", open, close + 1, n);
        }
    }
}

