import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); // acscending order

        System.out.println(list);

        // FOR DESCENDING ORDER
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }

}
