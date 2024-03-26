package kz.zhami.interview.algorithms.another.middle;


public class RemoveNthNode {
    public static void main(String[] args) {
        RemoveNode node = new RemoveNode(1);
        node.next = new RemoveNode(2);
        node.next.next = new RemoveNode(3);
        node.next.next.next = new RemoveNode(4);
        node.next.next.next.next = new RemoveNode(5);

        var head = removeNthNode(node, 5);
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static RemoveNode removeNthNode(RemoveNode head, int n) {
        RemoveNode slow = head;
        RemoveNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static RemoveNode reverse_1(RemoveNode node) {
        RemoveNode previous = null;
        RemoveNode current = node;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


    public static RemoveNode reverse(RemoveNode node) {
        RemoveNode previous = null;
        RemoveNode current = node;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}

class RemoveNode {
    int value;
    RemoveNode next;

    public RemoveNode(int value) {
        this.value = value;
        next = null;
    }

    public RemoveNode() {
    }
}