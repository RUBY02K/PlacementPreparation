class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder[] arr = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int row = 0;
        int direction = 1;

        for (int i = 0; i < s.length(); i++) {

            // current row me character
            arr[row].append(s.charAt(i));

            // direction change
            if (row == numRows - 1) {
                direction = -1;
            }
            else if (row == 0) {
                direction = 1;
            }

            // next row
            row += direction;
        }

        // sabko combine
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            ans.append(arr[i]);
        }

        return ans.toString();
    }
}