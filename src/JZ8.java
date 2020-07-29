
/**
 * @author Administrator
 * <p>
 * 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 思路：逆向思维--下台阶，如果我从第n个台阶进行下台阶，下一步有2中可能，一种走到第n-1个台阶，一种是走到第n-2个台阶。所以f[n] = f[n-1] + f[n-2].
 */
public class JZ8 {
    public  int JumpFloor(int target) {
        if (target == 2 || target == 1) {
            return target;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

}
