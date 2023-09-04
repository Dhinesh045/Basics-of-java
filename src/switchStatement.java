import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
     switchConcept();
     switchUsingNumber();
    }

    public static void switchConcept() {
        System.out.println("enter the code");
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        switch (i){
            case "one":
                System.out.println("the value is one ");
                break;
            case "two":
                System.out.println("the value is two");
            default:
                System.out.println("nothing to commit");
        }

    }

    public static void switchUsingNumber() {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch (i){
            case 1:
                System.out.println("the number is one ");
                break;
            case 2:
                System.out.println("the number is two");
                break;
            default:
                System.out.println("nothing");
        }

    }
}
