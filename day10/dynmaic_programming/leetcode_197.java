class Solution {

    int[] dp;

    int func(int ind, int[] nums) {
        if (ind >= nums.length) return 0;

        if (dp[ind] != -1) return dp[ind];

        int max = 0;

        // try taking nums[ind] and move to all possible next choices
        for (int i = ind + 2; i < nums.length; i++) {
            max = Math.max(max, nums[i] + func(i, nums));
        }

        dp[ind] = max;
        return dp[ind];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);

        int ans = 0;

        // try every index as starting house
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, nums[i] + func(i, nums));
        }

        return ans;
    }
}
