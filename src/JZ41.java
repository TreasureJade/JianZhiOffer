import java.util.ArrayList;

/**
 * 和为S的连续正数序列
 * 滑动窗口
 * <p>
 * 目标值为S 则查找范围为[1,S]
 * 定义一个窗口，这个窗口内的数字是连续且等差(1)，和为S
 * <p>
 * 等差计算公式: (a0+an) * n/2
 */
public class JZ41 {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // 定义窗口起点位置和结束位置
        int start = 1;
        int end = 2;
        while (start < end) {
            // end -start +1 代表窗口内元素个数
            int total = (start + end) * (end - start + 1) / 2;
            if (total == sum) {
                ArrayList<Integer> list = new ArrayList();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                result.add(list);
                end++;
                // 值比期望值小，说明区间不够大，结束位置后移
            } else if (total < sum) {
                end++;
                // 值比期望值大，说明区间过大，起始位置后移
            } else {
                start++;
            }
        }
        return result;

    }

}
