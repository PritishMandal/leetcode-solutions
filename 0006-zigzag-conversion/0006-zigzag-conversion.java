class Solution {
    public String convert(String s, int numRows) {

        // Logic:
        // Characters ko zigzag pattern mein rows ke andar store karenge.
        // Direction: top -> bottom -> top -> bottom...

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Har row ke liye StringBuilder
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        int direction = 1; // 1 = down, -1 = up

        for (char ch : s.toCharArray()) {

            // Character ko current row mein add karo
            rows[row].append(ch);

            // Last row -> direction change
            if (row == numRows - 1) {
                direction = -1;
            }

            // First row -> direction change
            else if (row == 0) {
                direction = 1;
            }

            // Next row
            row += direction;
        }

        // Saari rows ko combine karo
        StringBuilder ans = new StringBuilder();

        for (StringBuilder r : rows) {
            ans.append(r);
        }

        return ans.toString();
    }
}