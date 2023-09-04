import java.util.Scanner;

public class ifAndElse {
    public static void main(String[] args) {
        ifAndElse();
        nested();
    }

    public static void ifAndElse() {


//        example
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%2==0){
            System.out.println(i+ " is even number");
        }
        else{
            System.out.println(i+ " is odd number");
        }
    }


    public static void nested() {
//        nested if else example
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i<10){
            System.out.println("less");
        }
        else if(i==10){
            System.out.println("equal");
        }
        else
            System.out.println("greater");
    }
}
