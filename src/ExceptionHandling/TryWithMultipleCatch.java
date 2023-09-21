package ExceptionHandling;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int i=34;
        int j=43;
        int[] arr= new int[5];
        arr[3]=45;

        try{
            System.out.println(arr[3]);
            System.out.println(arr[6]);

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException"+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException"+e);
        }
    }

}
