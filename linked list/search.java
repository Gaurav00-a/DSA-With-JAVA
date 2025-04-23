public class search {

    public static Node head;

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

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(3);

        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

    }

}
