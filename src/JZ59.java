import java.util.*;

/**
 * 之字型打印二叉树
 * <p>
 * 偶数层翻转
 * <p>
 */
public class JZ59 {


    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        int count = 1;
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            // 层序遍历二叉树
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                list.add(tmp.val);
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
            // 层数为偶数的翻转
            if (count % 2 == 0) {
                Collections.reverse(list);
            }
            res.add(list);
            count++;
        }
        return res;


    }



/**
 *
 * 利用队列和栈实现
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }

        Stack<TreeNode> st = new Stack<>();
        Queue<TreeNode> que = new LinkedList<>();

        int dir = 1;
        st.push(pRoot);

        ArrayList<Integer> list = new ArrayList<>();
        while (!st.empty()) {
            int size = st.size();
            // 访问当前层
            for (int i = 0; i < size; i++) {
                // 取出栈顶元素（父节点）
                TreeNode curr = st.pop();
                list.add(curr.val);
                // 确定遍历顺序
                TreeNode first = (dir == 1) ? curr.left : curr.right;
                TreeNode second = (dir == 1) ? curr.right : curr.left;
                if (first != null) {
                    que.offer(first);
                }
                if (second != null) {
                    que.offer(second);
                }

            }
            res.add(new ArrayList<>(list));
            list.clear();
            while (!que.isEmpty()) {
                st.push(que.poll());
            }
            dir = (dir == 1) ? 2 : 1;

        }
        return res;

    }

**/
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

}
