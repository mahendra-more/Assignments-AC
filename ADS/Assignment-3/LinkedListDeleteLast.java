public class LinkedListDeleteLast {
    static class Node { int data; Node next; Node(int d){ data=d; } }
    Node head;

    void deleteLast() {
        if (head == null) return;
        if (head.next == null) { head = null; return; }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListDeleteLast list = new LinkedListDeleteLast();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.deleteLast();
        list.printList(); // 10 -> 20 -> 30
    }
}
