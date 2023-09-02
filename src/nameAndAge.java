import java.util.Scanner;

public class nameAndAge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name: ");
        String s=sc.nextLine();
        System.out.println("Enter the Age");
        int i=sc.nextInt();
        System.out.println("your name is "+s);
        System.out.println("your age is "+i);
    }
}
