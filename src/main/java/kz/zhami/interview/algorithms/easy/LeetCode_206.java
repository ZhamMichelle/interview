package kz.zhami.interview.algorithms.easy;

public class LeetCode_206 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        var node = reverseList(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        var rest = reverseList(head.next);
        head.next.next = head;

        head.next = null;
        return rest;
    }
}

