import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * <p>
 * DFS的回溯算法
 */
public class JZ24 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        findPathDFS(root, target, result, list);
        return result;
    }

    /**
     * @param root   根节点
     * @param target 目标值
     * @param result 结果集
     * @param list   待选结果集
     */
    public void findPathDFS(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        // 当前值放入待选结果集
        list.add(root.val);
        // 剪枝
        target -= root.val;
        // 去除不符合要求的路径
        if (root.left == null && root.right == null && target == 0) {
            result.add(new ArrayList<Integer>(list));
        }

        findPathDFS(root.left, target, result, list);
        findPathDFS(root.right, target, result, list);

        // 回退
        list.remove(list.size() - 1);


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
