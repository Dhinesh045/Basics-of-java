package loopConcept;

import java.util.Scanner;

public class primeOrnot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2; i<=n/2;i++ )
            if(n%i==0){
                isPrime=false;
                break;
            }
        System.out.println(isPrime ? "prime" : "not a prime");
    }
}
