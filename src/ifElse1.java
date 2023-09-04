import java.util.Scanner;
public class ifElse1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the question: ");
        Double i=sc.nextDouble();
        char k=sc.next().charAt(0);
        Double j= sc.nextDouble();


        if(k=='+'){
            System.out.println("the value is 3" + (i+j));
        }
         else if (k=='-'){
            System.out.println("the value is "+ (i - j));
        }
         else if(k=='/'){
            System.out.println("the value is "+(i/j));
        }
         else if(k=='*'){
            System.out.println("the value is "+(i*j));
        }
 else {
            System.out.println("invalid operator");
        }
    }
}
