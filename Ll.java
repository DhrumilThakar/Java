public class Ll {
    public static class Node {
        int data;
        Node next;// coz next point kar se ek node ne j already object che node class no

        Node(int data)// step 2
        {
            this.data = data;
            this.next = null;

        }
    }

    // Adding a node at first position of linkedlist
    public void add(int x) {
        Node new_node = new Node(x);// creating the new node step 1
        // if the given node is empty
        if (head == null) {
            head = tail = new_node;
            return;
        }
        new_node.next = head;// step 3
        head = new_node;// step 4
    }

    // Adding a node at given index in the linedlist
    public void add(int x, int index) {
        // we can use both while and for loop to perform this . But we prefer while
        // because in the case when the nuber of linked list is larger and we want to
        // add at a particular index we can't make sure how many time does the loop is
        // going to execute
        Node new_node = new Node(x);
        Node q = head;
        int i = 0;
        while (i < index - 1) {
            q = q.next;
            i++;
        }
        /*
         * for(int i = 0;i<index-1;i++)
         * {
         * q = q.next;
         * }
         */
        new_node.next = q.next;
        q.next = new_node;
    }

    // Adding at last of the linkedlist
    public void last(int x) {
        Node new_node = new Node(x);
        if (head == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    // printing the list
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        Ll l = new Ll();
        l.print();
        l.add(2);
        l.print();
        l.add(1);
        l.print();
        l.last(3);
        l.print();
        l.last(4);
        l.print();
        l.add(5, 1);
        l.print();
    }
}