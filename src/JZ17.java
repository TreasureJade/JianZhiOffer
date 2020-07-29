

/**
 * @author Administrator
 * 题目描述：输入两棵二叉树A，B，判断B是不是A的子结构。
 */
public class JZ17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1!=null&&root2!=null){
            if (root1.val==root2.val){
                result = judgeTree(root1,root2);
            }
            //如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
            if (!result) {
                result = HasSubtree(root1.left,root2);
            }


            //如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
            if (!result) {
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;
    }

    public static boolean judgeTree(TreeNode root1, TreeNode root2) {

        // tree2还没遍历完，1就遍历完成了，返回false
        if (root2!=null&&root1==null){
            return false;
        }

        if (root2==null){
            return true;
        }

        if (root1.val!=root2.val){
            return false;
        }

        return judgeTree(root1.left,root2.left) &&judgeTree(root1.right,root2.right);

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
