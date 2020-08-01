import java.util.Stack;

/**
 * 栈的压入、弹出序列
 * 思路：出栈序列中的第一个元素为入栈时的最后一个元素
 */
public class JZ21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int j = 0;
        // 条件不满足，一直入栈。
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();

    }
}
