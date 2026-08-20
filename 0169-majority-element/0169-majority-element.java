        // Majority element appears more than n/2 times.
        // We use Boyer-Moore Voting Algorithm.
        // Same candidate milne par count increase karenge,
        // different element milne par count decrease karenge.
        // Jab count 0 hoga, current element ko new candidate bana denge.
        // End mein majority element candidate ke paas hoga.
class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}