package LinkedList;

// Remove this if running from same folder
// package LinkedList;

public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add at first
    public void add1(String data) {
        Node a = new Node(data);
        if (head == null) {
            head = a;
            return;
        }
        a.next = head;
        head = a;
    }

    // add at last
    public void addLast(String data) {
        Node b = new Node(data);
        if (head == null) {
            head = b;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = b;
    }

    // delete from first
    public void deleteFirst(String data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(String data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node SecondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            SecondLastNode = SecondLastNode.next;
        }
        SecondLastNode.next = null;
    }

    // print the linkedlist
    public void print() {
        Node curNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.add1("Is");
        list.add1("Name");
        list.add1("My");
        list.addLast("Naveen");
        list.print();
        list.deleteFirst("My");
        list.deleteLast("Naveen");
        list.print();
    }
}
