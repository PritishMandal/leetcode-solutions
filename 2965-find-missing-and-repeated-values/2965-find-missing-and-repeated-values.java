class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        /*
         LOGIC:

         1. Grid ka size n x n hai, isliye total numbers n² honge.

         2. Numbers 1 se n² tak hone chahiye.

         3. Ek number 2 baar repeat hai aur ek number missing hai.

         4. Ek frequency array banayenge:
            count[i] = number i kitni baar aaya.

         5. Grid ke har element ko count karenge.

         6. 1 se n² tak check karenge:
            - count[i] == 2 → repeated number
            - count[i] == 0 → missing number

         7. Answer mein pehle repeated aur phir missing return karenge.
        */


        int n = grid.length;
        int total = n * n;

        int[] count = new int[total + 1];

        // Har number ki frequency count karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        // Repeated aur missing number find karo
        for (int i = 1; i <= total; i++) {
            if (count[i] == 2) {
                repeated = i;
            }

            if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}