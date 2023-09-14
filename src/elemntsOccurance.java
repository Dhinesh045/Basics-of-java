import java.util.Scanner;

public class elemntsOccurance {
//    Writing a program that displays the number of
//    occurrences of an element in the array.
public static void main(String[] args) {
    int[] index={2,3,4,5,2,3,4,7,8,8,9,2,2,2,2,2,2,2,2};

    System.out.println("Enter the number: ");
    int add = 0;
    int val=2;

    for(int i=0;i<index.length;i++){
        if(val==index[i])
        add++;

    }
    System.out.print(val+" occurance "+add+" times");
}
}
