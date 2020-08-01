import java.util.Stack;

/**
 * 包含min函数的栈
 * 题目：定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class JZ20 {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        // 若节点比原栈顶元素小，直接push进去
        if (minStack.isEmpty() || minStack.peek() > node) {
            minStack.push(node);
        } else { // 节点比原最小值大，此时最小值为原栈顶元素
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        // 出栈时
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
