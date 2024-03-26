package kz.zhami.interview.algorithms.middle;

public class LeetCode_19 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node22 = new ListNode(2);
        ListNode node11 = new ListNode(1, node22);

        ListNode node111 = new ListNode(1);

        var node = removeNthFromEnd(node11, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        var lengh = 0;
        ListNode helper = head;
        while (helper != null) {
            lengh++;
            helper = helper.next;
        }

        ListNode node;
        if (lengh != 1) {
            node = getNode(head, lengh - n, 1);
        } else {
            node = null;
        }
        return node;
    }

    public static ListNode getNode(ListNode head, int k, int i) {
        if (head.next == null) {
            return head;
        }
        if (k == 0) {
            k = -1;
            head = getNode(head.next, k, ++i);
        }

        if (i == k) {
            if (head.next.next != null) {
                head.next = getNode(head.next.next, k, ++i);
            } else {
                head.next = null;

            }
        } else {
            if (head.next != null) {
                head.next = getNode(head.next, k, ++i);
            }
        }
        return head;
    }

}

