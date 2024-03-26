package kz.zhami.interview.algorithms.another;

public class ReversalLinkedList_1 {
    public static void main(String[] args) {
        var head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = head.next.next;

        var r = reverse(head);
        while (r != null) {
            System.out.println(r.value);
            r=r.next;
        }
    }

    public static Node reverse(Node head) {
        var current = head;
        Node previos = null;
        while (current != null) {
            var next = current.next;
            current.next=previos;
            previos=current;
            current=next;
        }
        return previos;
    }
}
