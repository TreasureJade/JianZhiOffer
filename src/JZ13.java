import java.util.ArrayList;
import java.util.List;

/**
 * 调整数组顺序使得奇数在前、偶数在后
 *
 * 题目描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * <p>
 * 思路：开辟出两个新数组，一个放奇数，一个放偶数
 */
public class JZ13 {
    public static void reOrderArray(int[]  array) {

        List jishu = new ArrayList();
        List oushu = new ArrayList();

        // 将奇数和偶数分别放置两个数组
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                jishu.add(array[i]);
            } else {
                oushu.add(array[i]);
            }
        }

        for (int i = 0; i < oushu.size(); i++) {
            array[i]= (int) jishu.get(i);
        }


        for (int i = 0; i < jishu.size(); i++) {
            array[i] = (int) jishu.get(i);
        }
    }
    
}
