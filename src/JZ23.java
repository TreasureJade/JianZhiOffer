/**
 * 二叉搜索树的后序遍历
 * <p>
 * 将序列分成三部分，前半部分小于根节点【左子树】，后半部分大于根节点【右子树】
 */
public class JZ23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }

        return verifySquenceOfBSTHelper(sequence, 0, sequence.length - 1);

    }

    private boolean verifySquenceOfBSTHelper(int[] sequence, int start, int end) {
        // 递归结束
        if (start >= end) {
            return true;
        }

        // 后序序列中的根节点
        int root = sequence[end];

        int i = 0;
        // 左子树的所有节点小于根节点
        while (i < end && sequence[i] < root) {
            i++;
        }

        for (int j = i; j < end; j++) {
            // 右子树大于root
            if (sequence[j] < root) {
                return false;
            }
        }
        // 验证下边的左子树和右子树是否符合要求
        return verifySquenceOfBSTHelper(sequence, start, i - 1)
                && verifySquenceOfBSTHelper(sequence, i, end - 1);
    }
}
