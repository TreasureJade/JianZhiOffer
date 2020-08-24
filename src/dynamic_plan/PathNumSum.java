package dynamic_plan;

/**
 * 带权值的最小路径和
 * 跟路径和相似，带了权值
 * 状态方程：F（i,j）= Min（F(i-1,j) + F(i,j-1)）+array[i][j]
 * 初始状态：F(0,0) = array[0][0]
 * 第一行：F(0,j) = F(0,j-1) + array[0][j]
 * 第一列：F(j,0) = F(i-1,j) + array[i][0]
 * 返回：F(row-1,col-1)
 * <a>
 * https://www.nowcoder.com/practice/23462ed010024fcabb7dbd3df57c715e?tpId=46&tqId=29115&tPage=1&rp=1&ru=/ta/leetcode&qru=/ta/leetcode/question-ranking
 * </a>
 */
public class PathNumSum {
    /**
     * @param grid int整型二维数组
     * @return int整型
     */
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        // 如果为空或者只有一行，返回0
        if (row == 0 || col == 0) {
            return 0;
        }
        // 初始化F(0,j)和F(i,0)
        for (int i = 1; i < row; i++) {
            grid[i][0] = grid[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < col; i++) {
            grid[0][i] = grid[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[row - 1][col - 1];
    }
}
