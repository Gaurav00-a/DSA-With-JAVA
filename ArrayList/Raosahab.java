import java.util.ArrayList;

public class Raosahab {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.size());

        // PRINT THE ARRAY LISTTT
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // list.add(4, 20);

    // System.out.println(list);

    // GET OPERATION;

    // int element = list.get(2);
    // System.out.println(element);

    // // DELETE
    // list.remove(3);
    // System.out.println(list);

    // SET FUNCTION
    // WORKS ON A LINEAR MANNER

    // list.set(2, 10);
    // System.out.println(list);

    // CONTAINS ELEMENT
    // System.out.println(list.contains(1));
    // // CONTAINS ELEMENT
    // System.out.println(list.contains(11));

}
