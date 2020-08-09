package dynamic_plan;

/**
 * 斐波那契数列
 * 简单的动态规划
 * 状态：F（n）
 * 状态方程：F(n) = F(n-1)+F(n-2)
 * 初始值: F(1)=F(2)=1
 * 返回 F(n)
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
