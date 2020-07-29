import java.util.Stack;

/**
 * 用两个栈实现队列
 */
public class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void push(int node) {
        s1.push(node);
    }

    public int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int ret = s2.pop();
        if (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return ret;
    }
}
