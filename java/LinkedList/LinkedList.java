import java.lang.StringBuilder;
import java.lang.IndexOutOfBoundsException;
public class LinkedList {

    private class Node {

        Node next = null;
        String data;

        public Node(String str) {
            this.data = str;
        }
    }

    private Node head;
    private int size = 0;

    void appendToTail(String str) {
        Node end = new Node(str);
        this.size += 1;
        Node pointer = this.head;
        if (pointer == null) {
            this.head = end;
            return;
        }
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = end;
    }

    public Node getNode(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node pointer = this.head;
        int currIndex = 0;
        while (currIndex < index) {
            pointer = pointer.next;
            currIndex += 1;
        }
        return pointer;
    }

    @Override
    public String toString() {
        if (this.head == null) {
            return null;
        }
        StringBuilder string = new StringBuilder();
        Node pointer = this.head;
        while (pointer != null) {
            string.append(pointer.data);
            if (pointer.next != null) {
                string.append(" -> ");
            }
            pointer = pointer.next;
        }
        return string.toString();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.appendToTail("a");
        ll.appendToTail("b");
        ll.appendToTail("c");
        ll.appendToTail("d");
        ll.appendToTail("e");
        System.out.println(ll);
        System.out.println(ll.getNode(5).data);
    }

}
