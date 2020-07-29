/**
 * 题目描述：打印链表中倒数第k个节点
 * 1. 统计一共有多少个节点
 * 2. 指针front往前走k步，尾指针走向头指针
 * 3. front为空时。尾指针指向就是倒数第k个节点。
 */
public class JZ14 {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 0) {
            return null;
        }

        ListNode front = head;
        ListNode real = head;

        while (k > 0 && front != null) {
            k--;
            front = front.next;
        }

        while (front != null) {
            front = front.next;
            real = real.next;
        }
        // 链表中没有倒数第k个值
        if (k > 0) {
            return null;
        }
        return real;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
