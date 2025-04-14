import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();
    }
    // how to declarea strings
    // char arr[] = { 'a', 'b', 'c', 'd' };
    // String str = "abcd";
    // String str2 = new String("xyz");

    // strings are immutable
    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);

    // FOR LENGTH
    // String fullname = "rao sahab";
    // System.out.println(fullname.length());

    // concatenation
    public static void main(String[] args) {

        String firstname = "gaurav";
        String lastname = "yadava";
        String fullname = firstname + "  " + lastname;

        printLetters(fullname);

    }

}
