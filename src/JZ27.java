import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串的排列，可看作是一棵多叉树
 * 穷举，然后回溯
 */
public class JZ27 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, result);
            Collections.sort(result);
        }
        return result;
    }

    private void PermutationHelper(char[] str, int start, ArrayList<String> result) {
        if (start == str.length - 1) {
            if (!IsExist(result, str)) {
                result.add(new String(str));
            }
            return;
        }
        for (int i = start; i < str.length; i++) {
            // 确定以哪个字符开始
            Swap(str, start, i);
            // 确定字符之后。i是决定排列的开始，求sub字符串，都要以start+1开始
            PermutationHelper(str, start + 1, result);
            Swap(str, start, i);

        }
    }

    private void Swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

    }

    /**
     * 判断序列是否已经存在
     *
     * @param result
     * @param str
     * @return
     */
    private boolean IsExist(ArrayList<String> result, char[] str) {
        return result.contains(String.valueOf(str));
    }


}
