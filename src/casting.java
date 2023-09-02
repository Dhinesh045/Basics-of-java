public class casting {
//   widening casting
    public static void main(String[] args) {
        widening();
        narrow();
    }

    public static void widening() {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

    }

    public static void narrow() {


    double myDouble = 9.78d;
    int myInt = (int) myDouble;

    System.out.println(myDouble);
    System.out.println(myInt);
}
}
