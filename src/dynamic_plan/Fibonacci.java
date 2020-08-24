package dynamic_plan;

/**
 * 斐波那契数列
 * 简单的动态规划
 * 状态：F（n）
 * 状态方程：F(n) = F(n-1)+F(n-2)
 * 初始值: F(1)=F(2)=1
 * 返回 F(n)
 * <a>
 *  https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * </a>
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;

    }


}
