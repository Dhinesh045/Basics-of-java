import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        while (i<1 || i>10){
            System.out.println("not between 10 try again: ");
            i=sc.nextInt();
        }
        System.out.println("between 10 ");
    }
}
