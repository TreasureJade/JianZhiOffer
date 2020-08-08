/**
 * 两个链表的公共节点
 *
 * 如果有交点，则链表后边的元素都是相同的
 * 让长的链表先走abs（length1-length2）步，后边长度一样，往后找第一个相同的节点。
 *
 */
public class JZ36 {


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int p1Length = getListLength(pHead1);
        int p2Length = getListLength(pHead2);

        int step = Math.abs(p1Length - p2Length);
        if (p1Length > p2Length) {
            while (step > 0) {
                pHead1 = pHead1.next;
                step--;
            }
        } else {
            while (step > 0) {
                pHead2 = pHead2.next;
                step--;
            }
        }

        while (pHead1 != null && pHead2 != null) {
            if (pHead1 == pHead2) {
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;

    }

    private int getListLength(ListNode pHead) {
        if (pHead != null) {
            int len = 0;
            while (pHead != null) {
                len++;
                pHead = pHead.next;
            }
            return len;
        }
        return 0;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
