import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 将数组排成最小数
 * <p>
 * 序列中任何一个元素y，和它前的x进行有序组合形成xy，比和他后边的任何一个元素z进行有效序列组合yz，满足条件xy<yz
 * <p>
 * {32,31} -> 3132 则排完序之后的有效序列是{31,32}
 */
public class JZ32 {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null) {
            return "";
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String xy = o1 + "" + o2;
                String yx = o2 + "" + o1;
                return xy.compareTo(yx);
            }
        });


        String result = new String();
        for (Integer i : list) {
            result += i;
        }
        return result;
    }
}
