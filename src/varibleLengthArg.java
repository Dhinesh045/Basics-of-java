public class varibleLengthArg {
    public static void main(String[] args) {
        int[] index={1,2,2,2};
        System.out.println(len(index));

    }
    static int len(int... numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum += numbers[i];

        }
        return sum;
    }
}
