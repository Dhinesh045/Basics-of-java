import java.util.Scanner;

public class breakAndContinue {
    public static void main(String[] args) {
        forLoop();
       whileLoop();
    }

    public static void forLoop() {
        for(int i=1;i<=10;i++){
            if( i%2==0){
                System.out.println( i+"this number are equal to zero");
                continue;
            }
            System.out.println(i+"not div by zero");

        }

    }

    public static void whileLoop() {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter a number between 1 to 10 ");
            int n=sc.nextInt();
            if(n<1 || n>10)
                continue;
                System.out.println("is between 1 to 10");
            }
        }
    }

