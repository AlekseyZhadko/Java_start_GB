package JavaAlgoritms.Seminar3;

public class Program {
    public static void main(String[] args) {
        myDList L = new myDList();
        L.push(0, 1); // 1
        L.push(1, 2); // 1 2
        L.push(0, 3); // 3 1 2
        L.push(1, 4); // 3 4 1 2
        L.push(4, 5); // 3 4 1 2 5

        L.print();
        L.turn();
        L.print();
    }
}

class myDList {
    Node Head;
    Node Tail;

    private class Node {
        int value;
        Node next;
        Node prev;
    }

    public Node push(int pos, int value) {
        Node node = new Node();
        node.value = value;

        if (pos == 0) {
            if (Head != null) {
                node.next = Head;
                Head.prev = node;
            } else {
                Tail = node;
            }
            Head = node;
            return node;
        }

        Node current = Head;
        int index = 0;
        if (current == null) {
            Head = node;
        } else {
            while (current.next != null && index < pos - 1) {
                current = current.next;
                index++;
            }
            Node next = current.next;
            if (next != null)
                next.prev = node;
            else
                Tail = node;
            current.next = node;
            node.next = next;
            node.prev = current;
        }
        return node;
    }


    public void print() {
        Node current = Head;
        while (current != null) {
            System.out.printf("%d ", current.value);
            current = current.next;
        }
        System.out.println();
    }

    public void turn() {
        Node temp=Head;
        Head=Tail;
        Tail=temp;
        Node current = Head;
        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.next;
        }
    }
}
