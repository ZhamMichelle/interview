package kz.zhami.interview.algorithms.easy;

public class LeetCode_21 {
    public static void main(String[] args) {
        ListNode node_13 = new ListNode(4);
        ListNode node_12 = new ListNode(2, node_13);
        ListNode node_11 = new ListNode(1, node_12);

        ListNode node_23 = new ListNode(4);
        ListNode node_22 = new ListNode(3, node_23);
        ListNode node_21 = new ListNode(1, node_22);

        var list = mergeTwoLists(node_11, node_21);
        System.out.println(list);
        while(list.next!=null){
            System.out.println(list.val);
            list=list.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        return list1;
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