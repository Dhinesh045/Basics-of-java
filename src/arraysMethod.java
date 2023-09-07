import java.util.Arrays;

public class arraysMethod {
    public static void main(String[] args) {
//        numberSort();
      System.out.println(" ");
        characterSort();

    }

    public static void numberSort() {
        int[] i={2,3,6,4,2,7,-1};
        Arrays.sort(i);
        for(int j=0;j<=i.length-1;j++)
            System.out.println(i[j]);

    }
    public static void characterSort()
    {
        char[] c={'a','v','E','D','A','a'};

                Arrays.sort(c);
        System.out.println(c);
    }
}
