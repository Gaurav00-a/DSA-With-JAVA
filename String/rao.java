import java.util.*;

public class rao {
    public static String substring(String str, int ei, int si) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += Str.charAt(i);
        }
    }return substr;

}

    public static void main(String args[]) {
        // SUBSTRING
        String str = "helloworld";
        System.out.println(substring(str, 0, 5));
    }
}
