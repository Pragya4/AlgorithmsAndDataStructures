import java.util.*;
 class Samsung_Balloon {
	public static void main(String args[]){
		int[] a={1,2,3,4};
		System.out.println(maxCoins(a));			
		}
static int maxCoins(int[] iNums) {
    int[] nums = new int[iNums.length + 2];
    int n = 1;
    for (int x : iNums) if (x > 0) nums[n++] = x;
    nums[0] = nums[n++] = 1;


    int[][] memo = new int[n][n];
    return burst(memo, nums, 0, n - 1);
}

static int burst(int[][] memo, int[] nums, int left, int right) {
    if (left + 1 == right) return 0;
    if (memo[left][right] > 0) return memo[left][right];
    int ans = 0;
    for (int i = left + 1; i < right; ++i)
        ans = Math.max(ans, nums[left] * nums[right] 
        + burst(memo, nums, left, i) + burst(memo, nums, i, right));
    memo[left][right] = ans;
    return ans;
}    
/*static int maxCoins(int[] nums) {
        // Extend list with head and tail (both are 1), index starts at 1
        int array[] = new int[nums.length + 2];
        array[0] = 1;
        array[array.length-1] = 1;
        for (int i = 0; i < nums.length; i++) {
            array[i+1] = nums[i];
        }

        // Initialize DP arrays, 1 index based
        int dp[][] = new int[array.length][array.length]; //dp[i][j] stands for max coins at i step, burst j
        for (int i =0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i=1; i< array.length-1; i++) {
            for (int j=i; j >=1; j--) {
                // k as last
                for (int k=j; k <= i; k++) {
                    dp[j][i] = Math.max(array[j-1]*array[i+1] + dp[j][k-1] + dp[k+1][i], dp[j][i]);
                }
            }
        }
	for(int i=0;i<array.length;i++){
		for(int j=0;j<array.length;j++){
			System.out.print(dp[i][j]+" ");				
				}		
		System.out.println();
		}
        return dp[1][array.length-2];
    }*/
}
