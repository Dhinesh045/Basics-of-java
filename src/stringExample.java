import java.util.Locale;

public class stringExample {
    public static void main(String[] args) {
        String sc="dhinesh";
        String nwe=sc.toUpperCase(Locale.ROOT);
        System.out.println(sc);
        System.out.println(nwe);
//        the new string is created and the original string is not modified.
    }
}
