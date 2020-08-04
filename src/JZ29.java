import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * topk问题
 *
 * 采用最大堆思想 利用PriorityQueue实现
 */
public class JZ29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || k > input.length || k <= 0) {
            return list;
        }

        PriorityQueue<Integer> queue = new PriorityQueue(k, Collections.reverseOrder());
        for (int i = 0; i < input.length; i++) {
            // 前插入k个数据，queue自动排序
            if (i < k) {
                queue.offer(input[i]);
            } else {
                // 开始淘汰元素，每次淘汰最大的，剩下的就是最小的。
                if (input[i] < queue.peek()) {
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(queue.poll());
        }
        return list;
    }
}
