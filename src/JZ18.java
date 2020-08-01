/**
 * 镜像二叉树
 *
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */
public class JZ18 {
    public void Mirror(TreeNode root) {
        // 叶子节点为null 则创建完成
        if (root==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);

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
