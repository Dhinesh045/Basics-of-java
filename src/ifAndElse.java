import java.util.Scanner;

public class ifAndElse {
    public static void main(String[] args) {
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
}
