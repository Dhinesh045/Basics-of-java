public class arrayConcept1 {
//    arrays are passed by reference
    public static void main(String[] args) {
        int[] numbers={1,2};
        for (int l=0;l<numbers.length;l++)
        System.out.print(numbers[l]+ " ");
        System.out.println(" ");
        change(numbers);
        printMethod(numbers);

    }
    public static void change(int[] numbers){
        numbers[0]=2;
        numbers[1]=1;
    }
    public static void  printMethod(int[] numbers){
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}
