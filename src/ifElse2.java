import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        System.out.println(" enter a four digit number ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int fourthDigit = i % 10;
        int thirdDigit = (i / 10) % 10;
        int secondDigit = (i / 100) % 10;
        int firstDigit = (i / 1000);
        if (i < 999 || i>9999) {
            System.out.println(" please enter a four digit number");
        } else {
            if (fourthDigit + thirdDigit == secondDigit + firstDigit) {
                System.out.println("lucky");
            } else {
                System.out.println("not lucky");
            }
        }
    }
}
