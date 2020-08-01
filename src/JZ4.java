/**
 * 重建二叉树
 * 根据二叉树前序和中序的结果，重建二叉树
 */
public class JZ4 {


    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        return reConstructBinaryTreeCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    /**
     * @param pre      前序序列
     * @param preStart 前序开始
     * @param preEnd   前序结束
     * @param in       中序序列
     * @param inStart  中序开始
     * @param inEnd    中序开始
     * @return 重建后的二叉树
     */
    private TreeNode reConstructBinaryTreeCore(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {

        if (preStart>preEnd||inStart>inEnd){
            return null;
        }

        // 找到二叉树的根节点
        TreeNode root = new TreeNode(pre[preStart]);

        // 在中序序列中找到根节点
        for (int i = inStart; i <= inEnd; i++) {
            // 从inStart到i 是二叉树的左子树的中序
            if (root.val == in[i]) {
                root.left = reConstructBinaryTreeCore(pre, preStart + 1, i-inStart+preStart, in, inStart, inEnd);
                root.right = reConstructBinaryTreeCore(pre, i - inStart + preStart + 1, preEnd, in, i + 1, inEnd);
                break;
            }
        }

        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
