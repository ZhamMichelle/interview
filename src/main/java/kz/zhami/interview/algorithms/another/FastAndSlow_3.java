package kz.zhami.interview.algorithms.another;

public class FastAndSlow_3 {
    public static void main(String[] args) {
        var head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(getCountNode(head));
    }

    public static int getCountNode(Node head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return calculate(slow);
            }
        }
        return 0;
    }

    public static int calculate(Node slow) {
        var current = slow;
        int counter = 0;
        while (true) {
            current=current.next;
            counter++;
            if (current == slow)
                break;
        }
        return counter;
    }
}
