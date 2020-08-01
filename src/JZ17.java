/**
 * @author hobo
 * 题目描述：输入两棵二叉树A，B，判断B是不是A的子结构。
 */
public class JZ17 {


    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean result = false;
        // 找寻根节点
        if (root1.val == root2.val) {
            // 相同从当前位置找
            result = isChildTree(root1, root2);
        }

        // 遍历左子树
        if (result != true) {
            result = isChildTree(root1.left, root2);
        }

        // 遍历右子树
        if (result != true) {
            result = isChildTree(root1.right, root2);
        }

        return result;

    }

    private boolean isChildTree(TreeNode root1, TreeNode root2) {
        // 遍历完成
        if (root2 == null) {
            return true;
        }
        // root2 !=null ，说明树中没有子结构
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }

        return isChildTree(root1.left, root2.left) && isChildTree(root1.right, root2.right);
    }


    class TreeNode {
        public int val;
        public TreeNode right;
        public TreeNode left;

        public TreeNode(int x) {
            val = x;
        }
    }

}
