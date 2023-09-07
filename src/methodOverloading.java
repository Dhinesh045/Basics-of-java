public class methodOverloading {

    public static void main(String[] args) {
sayHi();
        System.out.println(  sayHi("kumar"));
    }

    public static void sayHi() {
        System.out.print("Dhinesh ");

    }

    public static String sayHi(String name) {    // we must have different parameters


        return name;     // must need  different return type
    }
}
