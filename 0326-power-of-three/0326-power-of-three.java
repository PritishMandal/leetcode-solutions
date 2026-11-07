class Solution {
    public boolean isPowerOfThree(int n) {

        // Base Case: 1 is a power of 3 (3^0 = 1)
        if (n == 1) {
            return true;
        }

        // Agar number 0 ya negative hai, toh false
        // Agar 3 se completely divide nahi hota, toh false
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        // Recursive Call: Number ko 3 se divide karte jao
        return isPowerOfThree(n / 3);
    }
}