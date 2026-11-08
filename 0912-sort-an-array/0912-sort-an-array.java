class Solution {
    private Random rand = new Random();

    public int[] sortArray(int[] nums) {
        qsort(nums, 0, nums.length - 1);
        return nums;
    }

    private void qsort(int[] a, int lo, int hi) {
        // base case: 0 ya 1 element → already sorted
        if (lo >= hi) return;

        // random pivot: sorted input pe O(n^2) se bachata hai
        int pivot = a[lo + rand.nextInt(hi - lo + 1)];

        // lt: chhote wale ki boundary, gt: bade wale ki boundary, i: current element
        int lt = lo, i = lo, gt = hi;
        while (i <= gt) {
            if (a[i] < pivot) swap(a, lt++, i++);   // chhota → left side bhejo
            else if (a[i] > pivot) swap(a, i, gt--); // bada → right side bhejo, i mat badhao
            else i++;                                // barabar → beech mein rehne do
        }

        // barabar wale part ko skip karo, sirf chhote aur bade pe recursion
        qsort(a, lo, lt - 1);
        qsort(a, gt + 1, hi);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}