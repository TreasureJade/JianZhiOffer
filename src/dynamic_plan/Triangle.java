package dynamic_plan;

import java.util.ArrayList;

/**
 * 三角矩阵
 * <p>
 * 初始值：最下一行的最小值
 * 状态方程: F(i,j) = min(F(i+1,j),F(i+1,j+1)) + array[i][j]
 * 返回结果：F(0,0)
 *
 * <a>
 * https://www.nowcoder.com/practice/2b7995aa4f7949d99674d975489cb7da?tpId=46&tqId=29060&tPage=2&rp=2&ru=/ta/leetcode&qru=/ta/leetcode/question-rankin
 * </a>
 */
public class Triangle {

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if(triangle.isEmpty()) {
            return 0;
        }
        // F[n-1][n-1],...F[n-1][0]初始化
        ArrayList<ArrayList<Integer>> minPathSum = new ArrayList<>(triangle);
        int row = minPathSum.size();
        // 从倒数第二行开始
        for(int i = row - 2; i >= 0; --i){
            for(int j = 0; j <= i; ++j){
                // F(i,j) = min( F(i+1, j), F(i+1, j+1)) + triangle[i][j]
                int curSum = Math.min(triangle.get(i + 1).get(j),
                        triangle.get(i + 1).get(j + 1))
                        + triangle.get(i).get(j);
                minPathSum.get(i).set(j, curSum);
            }
        }
        return minPathSum.get(0).get(0);
    }

}
