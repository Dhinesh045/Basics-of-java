import java.util.Arrays;

public class fillingArray {
    public static void main(String[] args) {
        fillArray();
        int[] index={1,2,3,0,0,0,0,0};
        Arrays.fill(index,3,6,10);

        System.out.println(Arrays.toString(index));
    }
    static void fillArray(){
        String[] str=new String[10];
        Arrays.fill(str,1,7,"hello");
        System.out.println(Arrays.toString(str));
    }
}
