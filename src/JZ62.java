import java.util.Stack;

/**
 * 二叉搜索树中的第k个节点
 */
public class JZ62 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <= 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = pRoot;
        while (node != null || !stack.empty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                if (--k == 0) {
                    return node;
                }
                node = node.right;
            }
        }
        return null;

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
