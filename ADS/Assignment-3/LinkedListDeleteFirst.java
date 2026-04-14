public class LinkedListDeleteFirst {
    static class Node { int data; Node next; Node(int d){ data=d; } }
    Node head;

    void deleteFirst() { if (head != null) head = head.next; }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListDeleteFirst list = new LinkedListDeleteFirst();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.deleteFirst();
        list.printList(); // 20 -> 30 -> 40
    }
}
