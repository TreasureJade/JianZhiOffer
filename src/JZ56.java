/**
 * 删除链表中重复的节点
 */
public class JZ56 {


    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return pHead;
        }

        ListNode head = new ListNode(0);
        head.next = pHead;

        // 下标头指针
        ListNode prev = head;
        // 下标尾指针
        ListNode last = prev.next;

        // last永远在前面
        while (last != null) {
            // 找到重复的开始
            while (last.next != null && last.val != last.next.val) {
                prev = prev.next;
                last = last.next;
            }

            // 找到重复的区间
            while (last.next != null && last.val == last.next.val) {
                last = last.next;
            }

            if (prev.next != last) {
                prev.next = last.next;
            }
            last = last.next;
        }
        return head.next;

    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
