import java.util.ArrayList;

import javax.sql.rowset.serial.SerialArray;

public class multi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1); // 1 2 3 4 5
            list2.add(i * 2); // 2 4 6 8 10
            list3.add(i * 3); // 3 6 9 12 15
        }

        // main list me add kr diya okk bby 
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        // NESTED LOOPS
        // ye kaam hm 1 2 3 4 5 
                    //2 4 6 8 10
                    //3 6 9 12 15 is form me lane ke liye kr rahe hh okk y bby  
                    
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+ "  ");

            }
            System.out.println();
        }
    }
}
