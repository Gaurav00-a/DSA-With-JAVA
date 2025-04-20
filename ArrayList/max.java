import java.util.ArrayList;

public class max {
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

        int max = Integer.MIN_VALUE;

        for(int i =0; i<list.size(); i++) {
            if( max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(" max element = " + max);


}
}
