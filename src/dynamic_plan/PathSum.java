package dynamic_plan;

/**
 *
 * 路径总和
 * 状态方程：F（i,j）=F(i-1,j) + F(i,j-1)
 * 初始状态：F（0,j），F（i,0）等于1
 * 返回结果：F(m-1,n-1)
 * <a>
 * https://www.nowcoder.com/practice/166eaff8439d4cd898e3ba933fbc6358?tpId=46&tqId=29117&tPage=1&rp=1&ru=/ta/leetcode&qru=/ta/leetcode/question-ranking
 * </a>
 */
public class PathSum {
    /**
     *
     * @param m int整型
     * @param n int整型
     * @return int整型
     */
    public int uniquePaths (int m, int n) {
        int[][] pathNum = new int[m][n];
        // 初始状态
        for (int i = 0; i < m; i++) {
            pathNum[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            pathNum[0][i] = 1;
        }

        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                pathNum[i][j] = pathNum[i][j-1] + pathNum[i-1][j];
            }
        }
        return pathNum[m-1][n-1];
    }
}
