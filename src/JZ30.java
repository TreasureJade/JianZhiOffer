/**
 * 连续子序列的最大和
 * <p>
 * 动态规划 dp[i] = max(dp[i]+ array[i],array[i])
 */
public class JZ30 {

    public int FindGreatestSumOfSubArray(int[] array) {
//        int[] dp = new int[array.length];
//        dp[0] = array[0];
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
//            // 当前值比后边的值还小，
//            if (max < dp[i]) {
//                max = dp[i];
//            }
//        }
//        return max;


        int max = array[0];
        int total = array[0];

        for (int i = 1; i < array.length; i++) {
            if (total >=  0) {
                total += array[i];
            } else {
                total = array[i];
            }

            if (max < total) {
                max = total;
            }

        }

        return max;

    }
}
