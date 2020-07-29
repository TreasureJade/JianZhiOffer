import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class JZ28 {

    public static int MoreThanHalfNum_Solution(int[] array) {
        int size = array.length / 2;
        if (size < 1) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                count++;
                map.put(i, count);
            } else {
                map.put(i, 1);
            }
            if (map.get(i) > size) {
                return i;
            }
        }
        return 0;
    }

}
