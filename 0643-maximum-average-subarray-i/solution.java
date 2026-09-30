class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;
        int left = 0;
        double avg = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            // Add the current element
            sum += nums[i];

            // Keep the window size at most k
            if (i - left + 1 > k) {
                sum -= nums[left];
                left++;
            }

            // Process the window when its size becomes k
            if (i - left + 1 == k) {
                avg = Math.max(avg, (double) sum / k);
            }
        }

        return avg;
    }
}