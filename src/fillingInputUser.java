import java.util.Arrays;
import java.util.Scanner;

public class fillingInputUser {
//    Write a program that fills an array with n integers
//    entered by the user.
//    Suppose that the user can enter at least 1 number and
//    at most 20 numbers.
//    Resolve the same exercise with Points.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("How many Elements (max 20) :");
    int n=sc.nextInt();
    while(n<=0 || n>=20){
        System.out.println("Invalid Number");
        n=sc.nextInt();
    }
    int[] val=new int[n];
    fillingArrayofIntegers(val);
    printArrayofIntegers(val);
}
    static void printArrayofIntegers(int[] numbers){
        System.out.println("the elements are :");
        System.out.println(Arrays.toString(numbers));
    }
static void fillingArrayofIntegers(int[] numbers){
    Scanner sc=new Scanner(System.in);
for(int i=0;i<numbers.length;i++){
    numbers[i] = sc.nextInt();
}

}
}
