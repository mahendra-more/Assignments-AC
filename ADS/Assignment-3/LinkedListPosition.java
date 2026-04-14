public class LinkedListPosition {
    static class Node { int data; Node next; Node(int d){ data=d; } }
    Node head;

    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) { newNode.next = head; head = newNode; return; }
        Node temp = head;
        for (int i=0; temp!=null && i<pos-1; i++) temp = temp.next;
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
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
        LinkedListPosition list = new LinkedListPosition();
        list.insertAtPosition(10,0);
        list.insertAtPosition(20,1);
        list.insertAtPosition(30,2);
        list.insertAtPosition(40,3);
        list.insertAtPosition(25,2);
        list.printList(); // 10 -> 20 -> 25 -> 30 -> 40
    }
}
