class Solution {

    public int minSteps(int N) {
        // Your code goes here
         int n=N;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[1] = 0; // No step required to get to 1
        if (n >= 2) dp[2] = 1; // One step from 2 to 1 (2 / 2)
        if (n >= 3) dp[3] = 1; // One step from 3 to 1 (3 / 3)

        for (int i = 4; i <= n; i++)
        {
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], 1 + dp[i / 2]);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], 1 + dp[i / 3]);
            }
            dp[i] = Math.min(dp[i], 1 + dp[i - 1]);
        }

        return dp[n];  // Your code goes here
    }
}