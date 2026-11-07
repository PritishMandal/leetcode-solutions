class Solution {
    public boolean isPowerOfFour(int n) {

        // Base Case: 1 is a power of 4 (4^0 = 1)
        if (n == 1) {
            return true;
        }

        // Agar number 0 ya negative hai, toh false
        // Agar number 4 se completely divide nahi hota, toh false
        if (n <= 0 || n % 4 != 0) {
            return false;
        }

        // Recursive Call: Har baar n ko 4 se divide karo
        return isPowerOfFour(n / 4);
    }
}
