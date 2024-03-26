package kz.zhami.interview.algorithms.middle;


public class LeetCode_2 {
    public static void main(String[] args) {
        ListNode node_13 = new ListNode(3);
        ListNode node_12 = new ListNode(4, node_13);
        ListNode node_11 = new ListNode(2, node_12);

        ListNode node_23 = new ListNode(4);
        ListNode node_22 = new ListNode(6, node_23);
        ListNode node_21 = new ListNode(5, node_22);
        var node = addTwoNumbers(node_11, node_21);
        //System.out.println(reverseL1(node_11,node_11.val));
//        while (node.next != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
