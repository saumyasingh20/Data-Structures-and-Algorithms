package dynamic_programming;

public class DP3FrogJump {
	
	public static int frogJump(int n, int heights[]) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i = 1;i<n;i++){
            int firstStep = dp[i-1] + Math.abs(heights[i]-heights[i-1]);
            int secondStep = Integer.MAX_VALUE;
            if(i>1){
                secondStep = dp[i-2] + Math.abs(heights[i]-heights[i-2]);
            }
            dp[i] = Math.min(firstStep, secondStep);
        }
        return dp[n-1];
        
    }

}
