/**
 * 翻转链表、并打印反转后头节点的值
 */
public class JZ15 {


    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode new_head = null;

        while (head != null) {
            // 原链表去掉第一个节点
            ListNode p = head;
            head = head.next;

            // 将后边节点头插到新链表
            p.next = new_head;
            new_head = p;
        }

        return new_head;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
