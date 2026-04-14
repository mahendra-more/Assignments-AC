public class LinkedListDeleteValue {
    static class Node { int data; Node next; Node(int d){ data=d; } }
    Node head;

    void deleteByValue(int value) {
        if (head == null) return;
        if (head.data == value) { head = head.next; return; }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
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
        LinkedListDeleteValue list = new LinkedListDeleteValue();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.deleteByValue(30);
        list.printList(); // 10 -> 20 -> 40
    }
}
