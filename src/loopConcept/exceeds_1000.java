package loopConcept;

import java.util.Scanner;

public class exceeds_1000 {
    public static void main(String[] args) {
//        "done" when the output is exceeds 100.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int add = 0;
        while (true) {
            add += sc.nextInt();
            if (add >= 1000)
                break;

        }
        System.out.println( "done");
    }
}
