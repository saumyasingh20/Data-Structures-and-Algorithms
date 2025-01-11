package dynamic_programming;

public class DP4FrogJumpWithKDistance {
	public static int frogJump(int n, int heights[] , int k) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i = 1;i<n;i++){
            int minSteps = Integer.MAX_VALUE;
            for(int j = 1; j<=k;j++) {
            	if(i-j>=0){
                    int jump = dp[i-j] + Math.abs(heights[i] - heights[i-j]);
                    minSteps = Math.min(minSteps, jump);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n-1];
        
    }
}
