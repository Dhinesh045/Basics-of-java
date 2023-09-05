import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       int i;
        do {
            System.out.print("enter a number between 1 to 10 ");
           i=sc.nextInt();
        }
        while (i<1 || i>10);{
            System.out.println(i+ " number between 1 to 10");
        }
    }
}

