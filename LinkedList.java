import Stream.numbers;

public class LinkedList {
    Node head;
    private int size = 0;

    LinkedList() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        Node curNode = head;
        while (curNode.next.next != null) {
            curNode = curNode.next;
        }
        curNode.next = null;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    public void printElement() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {

            System.out.print(curNode.data + " ->");
            curNode = curNode.next;
        }
        System.out.println("Null");

    }

    public int returnSize() {
        return size;
    }

     public void revString() {
        if (head == null || head.next == null) {
            System.out.println("List is empty or having single node");
            return;
        }

        Node curNode = head;
        Node prevNode = null;
        while (curNode != null) {
            Node temp = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = temp;
 
        }
        head=prevNode;

        // Node prevNode = head;
        // Node curNode = head.next;

        // while (curNode != null) {
        // Node nextNode = curNode.next;
        // curNode.next = prevNode;

        // prevNode = curNode;
        // curNode = nextNode;
        // }
        // head.next = null;
        // head = prevNode;
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.addFirst("Mohammad");
        LL.addFirst("Areeb");
        LL.addLast("Pasha");
        LL.addLast("Asim");
        LL.addLast("Turk");
        LL.addLast("Rehan");
        LL.addLast("Nazish");

        // LL.addLast("Engineer");
        // LL.printElement();
        System.out.println();
        // LL.deleteLast();
        LL.printElement();
        System.out.println(LL.returnSize());
        LL.revString();
        LL.printElement();

    }
}