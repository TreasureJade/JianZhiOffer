import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 层序遍历二叉树
 * 思路：队列先进先出，先将父节点入队，再将他的左右子节点入队。每次list取出的是父节点，以此下推。
 */
public class JZ22 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode father = queue.poll();
            result.add(father.val);
            if (father.left != null) {
                queue.offer(father.left);
            }
            if (father.right != null) {
                queue.offer(father.right);
            }
        }
        return result;

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
