import java.util.HashMap;
import java.util.Map;

/**
 * 数组中只出现一次的数字
 */
public class JZ40 {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : array) {
            if (map.containsKey(item)) {
                map.put(item, 2);
            } else {
                map.put(item, 1);
            }
        }

        boolean b = true;
        for (int value : array) {
            if (map.get(value) == 1) {
                if (b) {
                    num1[0] = value;
                    b = false;
                } else {
                    num2[0] = value;
                }
            }
        }
    }
}
