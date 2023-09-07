import java.util.Scanner;

public class methodEx {
//    get an input name and age by user calling method
    public static void main(String[] args) {
        System.out.println("enter name and age : ");
        System.out.println("name "+getname() + " age "+ getname());


    }

    public static String getname() {
        return new Scanner(System.in).nextLine();
    }

    public static int getAge() {
        return new Scanner(System.in).nextInt();
    }
}
