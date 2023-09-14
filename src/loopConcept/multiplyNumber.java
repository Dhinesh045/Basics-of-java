package loopConcept;

import java.util.Scanner;

public class multiplyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int i;
        for( i=1 ;i <=n/2; i++)
            if(n%i==0)
        System.out.println(i);
//        sum+=i;
//        System.out.println(sum + n);

        }

    }

