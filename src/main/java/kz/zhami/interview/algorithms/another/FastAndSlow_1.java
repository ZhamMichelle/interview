package kz.zhami.interview.algorithms.another;

public class FastAndSlow_1 {
    public static void main(String[] args) {
        var head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(Node head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
