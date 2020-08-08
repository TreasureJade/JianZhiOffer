import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的深度
 * <p>
 * 递归层序遍历
 */
public class JZ38 {
    public int TreeDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
//         递归写法
//        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;

        Queue<TreeNode> q = new LinkedList<>();
        // root 入队列
        q.offer(root);
        int depth = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            // 处理一层，深度 +1
            depth++;
            for (int i = 0; i < size; i++) {
                // 获取头部元素，并在队列中删除
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return depth;

    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

}
