public class linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // Creating new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;

        }
        // Step 2
        newNode.next = head; // LINK

        // STEP 3
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2
        tail.next = newNode;

        // step 3
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " < ");
            temp = temp.next;

        }
        System.out.println();
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;

        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i=index-1; temp=previous;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        // SPECIAL CASE;
        if (size == 0) {
            System.out.println("ll is empty ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data; // want to delete.. this value..
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // WAP TO SEARCH A KEY:
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // WAP FOR SEARCH A KEY BU USING RECURSION:
    public int helper(Node Head, int key) {

        if (head == null) {
            return -1;

        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // WAP TO REVERSE A LINKED LIST
    public void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(3);

        ll.addLast(4);
        ll.add(2, 9);
        ll.print(); // 1->2->9->4->5
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.itrSearch(3));
        ll.Reverse();
        ll.print();

    }
}