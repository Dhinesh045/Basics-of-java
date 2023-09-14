import java.util.Arrays;

public class fillingArray {
    public static void main(String[] args) {
//        fillArray();
        int[] index={1,2,3,0,0,0,0,0};
        Arrays.fill(index,1,2,11);


        System.out.println(Arrays.toString(index));
    }

    private static void arrayFillBasedOnIndex(int i, int i1, int i2) {
    }

    static void fillArray(){
        String[] str=new String[10];
        Arrays.fill(str,5,2,"hello");
        System.out.println(Arrays.toString(str));
    }
    static void arrayFillBasedOnIndex(int[] index, int fromIndex, int toIndex, int actualValue){

        if(fromIndex<index.length|| toIndex>index.length || toIndex<fromIndex){
            System.out.println("the input is notValid");
        }
        else
        for(int i=fromIndex;i<=toIndex;i++){
            index[i] = actualValue;
            System.out.println(Arrays.toString(index));

        }



    }
}
