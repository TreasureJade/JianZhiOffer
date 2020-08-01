/**
 * @author Hobo
 * 斐波那契数列
 * 题目描述：现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。n<=39
 */
public class JZ7 {
    public int Fibonacci(int n) {
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
